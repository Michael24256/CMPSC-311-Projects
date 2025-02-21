/*
 *This exercise uses the Java LinkedList class.

Input file is words_no_duplicates-edited.txt
 Input each string putting it into a different LinkedList depending on the first character in the String. 

Then prompt the user for a (lower case) character and display all the words beginning with that character. 
(If the user enters an invalid character, trap them in a loop until they give you a valid one).

EXTRA credit: Allow the user to enter any alphabetic character (lower or upper case). You will then need to convert it to lower case. 
 */
package h4;

import java.io.*;
import java.util.*;

public class H4 {

    
    public static void main(String[] args) {
        
        LinkedList<String>[] arr = new LinkedList[26];
        createList(arr);
        int out=getListToOutput();
 
        printList(arr, out);
       
        
    
    }
    public static void createList(LinkedList<String>[] arr)
    {Scanner br = null;
        FileReader fr = null;   
        for (int i = 0; i < 26; i++) {
            arr[i] = new LinkedList<>(); //create all the linked lists
        }

        try {

            fr = new FileReader("words_no_duplicates-edited.txt");
            br = new Scanner(fr);
         
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found");
        

        }
         while (br.hasNext()) {  //add words to correct list
               String line = br.nextLine();
                int index = line.charAt(0) - 97;
                arr[index].add(line);
               
    }
    }
    public static void printList(LinkedList<String>[] arr, int index )
    {  Iterator<String> iter;
            iter= arr[index].listIterator(); 
            while(iter.hasNext())
                System.out.println(iter.next());
    }
    public static int getListToOutput()
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a character to see the list");
        String input = scnr.next();
        input = input.toLowerCase();
        char charInput = input.charAt(0); //get first character
        int output = (int) charInput - 97; //and its index
        
        while (output < 0 || output > 26) { //trap user if not in range
            System.out.println("Please input a valid character");
            input = scnr.next();
            input = input.toLowerCase();
            charInput = input.charAt(0);
            output = (int) charInput - 97;
           
        }
    return output;
    }
}
    

