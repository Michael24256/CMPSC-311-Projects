/*
 This program inputs lines of text from a textfile,
and outputs whether that line is a palindrome.
For this exercise all white space and non-alphabetic characters are ignored
 */

package palindrome;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;



public class Palindrome {

    
    public static void main(String[] args) {
        File inFile = new File("palin.txt");
          Scanner fileInput=null;
          
          
          String w, w1;
          boolean valid=true;
                 
          try{
           fileInput = new Scanner(inFile);
            
           
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
       while (fileInput.hasNext())
           {
           //collect a line of text, save as w1
               w=fileInput.nextLine();
               //eliminate spaces and punctuation
               w1=onlyChars(w);
               //check if palindrome:
            
               valid=isPalin(w1);
               
           
        //output
        if(valid)
               System.out.println("\""+w +".\""+" is a palindrome");
        else
             System.out.println("\""+w+".\""+ " is not a palindrome");
        //end loop
           } 
        
    }
    public static String onlyChars(String w1)
    { //create a string called w3, this is w1 all lowercase and with no punctuation
               w1=w1.toLowerCase();
               String w3="";
               char ch;
               for (int i=0; i<w1.length();i++)
               { ch=w1.charAt(i);
               if((ch>='a')&& (ch<='z'))
                   w3=w3+ch;
                   
               }
            
               return w3;
    }
    public static boolean isPalin(String w1)
    { //put w1 on stack 
        Stack<String> s = new Stack<String>();
               for (int i=0; i<w1.length();i++)
                   s.push(w1.substring(i,i+1));
               //and then pop stack concatenating onto w2
          String w2="";
               while (!s.empty())
               { w2=w2+s.pop();
               }
            
              
            //check if w1==w2. If so it IS a palindrome, otherwise NOT
               if(w1.equals(w2))
                 return true;
               else return false;
        
    }
    
}
