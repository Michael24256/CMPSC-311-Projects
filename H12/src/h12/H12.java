/*
 * This program inputs the first 100 words from the file words.txt
It then passes each word to a hash function and computes its hash value like this:
(the ascii value of the first character plus the ascii value of the second character ) mod 121.
 */
package h12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mehta
 */
public class H12 {

    public static void main(String[] args) {
        File inFile = new File("words.txt");
      
          Scanner fileInput=null;
          try{
           fileInput = new Scanner(inFile);
          }
           catch (FileNotFoundException e){
            System.out.println(e);
        }
          //get input and output in required form
           for(int i=0; i<100; i++)
           { String s=fileInput.nextLine();
               System.out.println(i + " " + s + "\t\t" + hashValue(s));
          
           }
       
           fileInput.close();
        }
        
    
    
    public static int hashValue(String s)
    { 

       int   a=(int)s.charAt(0);
       int   b=(int)s.charAt(1);
        
    return (a+b)%121;
    }
    
    }
    

