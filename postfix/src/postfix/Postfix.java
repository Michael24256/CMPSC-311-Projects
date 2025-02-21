//This program evaluates a postfix expression

package postfix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Postfix {

    
    public static void main(String[] args) {
       Stack<Integer> myStack = new Stack<Integer>();
      File f = new File("PostfixInput.txt"); // Text file
        Scanner p = null; // Scanner for both File IO and Keyboard input
        

        try {
            p = new Scanner(f); // Create the scanner to read the file
        } catch (FileNotFoundException e) { // Exit if bad things happen
            System.out.println("File not Found!");
            System.exit(-1);
        }
  String curr,s;
       Integer first, second, result;
        while (p.hasNextLine()) { // While we still have text in the file
            s = p.nextLine(); // Collect the word as a String
      System.out.print(s + " = " );
       //while the string is not empty
       while (!s.isEmpty())
       {
       //look at the first character
           curr = s.substring(0,1);
       //if it is an operator, pop two operands, perform the operation, and push the result
          
           if(curr.equals("+"))
           {second= myStack.pop();
            first = myStack.pop();
               result = first+second;
               myStack.push(result);
               
           }
           else if (curr.equals("-"))
              {second= myStack.pop();
            first = myStack.pop();
               result = first-second;
               myStack.push(result);
           }      
            else if (curr.equals("*"))
              {second= myStack.pop();
            first = myStack.pop();
               result = first*second;
               myStack.push(result);
           }  
           else if (curr.equals("/"))
              {second= myStack.pop();
            first = myStack.pop();
               result = first/second;
               myStack.push(result);
           }  
                   
       //else convert to an integer and put on the stack
           else {result= Integer.parseInt(curr);
           
           myStack.push(result);}
       //modify the string by eliminating the first character
           s=s.substring(1);
       } //end while
       //the stack holds the answer
       //pop the stack and print the result
       System.out.println(myStack.pop());
    }
    }
}
