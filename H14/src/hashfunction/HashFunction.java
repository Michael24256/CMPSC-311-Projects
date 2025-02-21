/*
 * This program calculates the total and average number of probes in a 
successful search of everything in the input file.
It then calculates the total and average number of probes in 
successful searches of everything with all possible hash values
Two methods are given for unsuccessful searches, depending on how this 
number is counted 
*/
package hashfunction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * @author jim1
 */
public class HashFunction {

    
    public static void main(String[] args) {
       File inFile = new File("words_no_duplicates.txt");
       //create hash table
    
       LinkedList[] htable = new LinkedList[121];
       //initialize hash table
       for(int i=0; i<=120; i++)
           htable[i] = new LinkedList();
       //input
          Scanner fileInput=null;
          try{
           fileInput = new Scanner(inFile);
          }
          catch (FileNotFoundException e){
            System.out.println(e);
        }
           int y=0;
           for(int i=0; i<4000; i++)
           { String s=fileInput.nextLine();           
        
            add(htable, s, hashValue(s));
           }
           //create counting array
           int[]c=new int[121];
         
         for(int i=0; i<=120; i++)
         { c[i]=htable[i].size();
            }
         
         
        System.out.println("The total number of probes in a successful search is " +successfulSearch(c,121));
       System.out.println("The average number of probes in a successful search is " +successfulSearch(c,121)/4000.0);
        System.out.println("The total number of probes in an unsuccessful search is " +unsuccessfulSearch(c,121));
       System.out.println("The average number of probes in an unsuccessful search is " +unsuccessfulSearch(c,121)/121.0);  
        
           fileInput.close();
        
        
    }
    
    public static int hashValue(String s)
    //method to calculate and return the hash value
    { int y= (int)s.charAt(0)+(int)s.charAt(1);
          
     y=y%121;
    return y;}
    
    public static void add(LinkedList h[], String s, int value)
            //method to add at the start of the linked list
    { 
            h[value].addFirst(s);
    }
  
    
   

    public static int successfulSearch(int[]c, int size)
    //method to calculate the total number of probes
    //in a search for each string in the hash table
    { int total=0;
    for (int i=0; i<size; i++)
    {
        total = total + c[i]*(c[i]+1)/2;
    }
       
        return total;
    }
    public static int unsuccessfulSearch(int[] c, int size)
      //method to calculate the number of probes in an unsuccessful search
            
    { int total=0;
    for(int i=0; i<121; i++)
        total=total + c[i] + 1;
        return total;
    }
    public static int unsuccessfulSearch2(int[] c, int size)
    //method to calculate the number of probes in an unsuccessful search
    { int total=0;
    for(int i=0; i<121; i++)
        if(c[i]==0) total++;
        else total += c[i];
        return total;
    }
}
    
    

