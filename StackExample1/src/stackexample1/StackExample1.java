/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackexample1;

import java.util.*;
public class StackExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] s = {"Hi", "bye", "one", "two"};
        Stack<String> myStack = new Stack<String>();
        for (int i=0; i<4; i++)
            myStack.push(s[i]);
        for (int i=0; i<14; i++)//note the 14
            if(!myStack.empty())
                System.out.println(myStack.pop());
        
        
    }
    
}
