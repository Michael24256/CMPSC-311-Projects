/*
 Input a string and output it with the characters reversed
 */
package stacklab2;

import java.util.Stack;

public class StackLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Character> c = new Stack<Character>();
        // Input a string
        String w="How now brown cow";
        //For each char in the string
        //push on stack
        for(int i=0; i<w.length();i++)
            c.push(w.charAt(i));
        //create an empty string wRev
        String wRev="";
        //for each element in the stack
        //pop and concatenate with wRev
        while(!c.isEmpty())
            wRev=wRev+c.pop();
        System.out.println("Original string was \"" +w + "\"");
        System.out.println("Reverse string was \"" +wRev+"\"");
    }
    
}
