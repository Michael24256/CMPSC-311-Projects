/*
 * This program takes the first 100 words from an input file and puta them
into a hash table fo size 121 using linear probing to handle collisions.
 */

package hashtablelinearprobing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * @author Jean Mehta
 */
public class HashTableLinearProbing {

    
    public static void main(String[] args) {
         File inFile = new File("words_no_duplicates.txt");
          Scanner fileInput=null;
          try{
           fileInput = new Scanner(inFile);
           
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
           //create hash table
       String[] htable = new String[121];
       //initialize hash table
       for(int i=0; i<120; i++)
           htable[i] = null;
       
       //get input and place each string into hash table
       //counting the number of probes taken as each is inserted
          int count=0; // the total numer of probes to insert 
           for(int i=0; i<100; i++)
           { String s=fileInput.next();
           
            int y=hashValue(s);
            count=count+add(htable, s, y);
           
            }
         System.out.println("The total number of probes in a successful search is " +count);
         System.out.println("The average number of probes in a successful search is " +count/100.0);
         System.out.println("The total number of probes in an unsuccessful search is " +unsuccessfulSearch(htable)); 
         System.out.println("The average number of probes in an unsuccessful search is " +unsuccessfulSearch(htable)/121.0);  
           fileInput.close();
    }
    public static int hashValue(String s)
    //method to calculate and return the hash value
    { int y= (int)s.charAt(0)+(int)s.charAt(1);
          
     y=y%121;
    return y;}
    
     public static int add(String h[], String s, int value)
             //method takes the hash table, the string, and its hash value as parameter
             //puts the string into the hash table
             //returns the updated hash table by parameter, and 
             //returns the number of probes required to place the string in the hash table
    { int c=1;
      while (h[value] !=null)
      { value=(value+1)%121;
       c++;
      }
      h[value]=s;
            return c;
    }
      public static int unsuccessfulSearch(String h[])
              //method calculates and returns the total number of probes (searches) in an 
              //unsuccessful search
      { int total=0;
       for (int val=0; val<121; val++)
       {  int a=val; int c=1;
       while (h[a]!=null )
       {
           c++;
           a=(a+1)%121;
       }
       total=total+c;
      
      }
    return total;
      }
}
