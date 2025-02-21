/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Parens {

     
    public static void main(String[] args) {
        File inFile = new File("H6Input1.txt");
          Scanner fileInput=null;         
          String s, c;               
          try{
           fileInput = new Scanner(inFile);
                  
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
       Stack<String> myStack; 
              
       while (fileInput.hasNext())
       {  //start with a new stack each time, so we know it is empty
           myStack = new Stack<String>();
       //input the string
       s = fileInput.next();
       System.out.println("The expression was " + s);
      //while the string is not empty
       while(!s.isEmpty())
       {   //peel off the first character
           c= s.substring(0,1);
           //if it is a left paren, put on the stack
         if (c.equals("("))
           myStack.push(c);
         //if it is a right paren
         else if(c.equals(")"))
          //check if the stack is empty, if so there are too many right parens
             
             if(myStack.isEmpty())
             { System.out.println("Too many right parentheses");
              System.exit(0);
             }
             //if the stack is not empty, pop
          else
             myStack.pop();
         //modify the string so that it no longer has the first character
           s=s.substring(1);
           
       }//while
       //if we get to here, check the stack
       //if it is empty, there were an equal number of left and right parens
       //if not empty, there were too many left parens
       if(myStack.isEmpty())
           System.out.println("There were an equal number of left and right parentheses");
       else
           System.out.println("There were too many left parentheses");
    }//end outer while     
       
    }//main
     
}
