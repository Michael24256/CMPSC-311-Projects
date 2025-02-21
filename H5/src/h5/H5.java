package h5;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;


public class H5 {
    // This program takes in a file of words into a linked list. It then prompts the user to enter words off of that list.
    // The new code word is the word that is after the actial word in the list
    // This is then printed out

   
    public static void main(String[] args) {
        File f = new File("words.txt"); // Text file
        Scanner p = null; // Scanner for both File IO and Keyboard input
        LinkedList<String> list = new LinkedList(); // List holding words

        try {
            p = new Scanner(f); // Create the scanner to read the file
        } catch (FileNotFoundException e) { // Exit if bad things happen
            System.out.println("File not Found!");
            System.exit(-1);
        }

        while (p.hasNextLine()) { // While we still have text in the file
            String word = p.nextLine(); // Collect the word as a String
            if (!list.contains(word)) { // If we don't have this word in the list already, add it
                list.add(word);
            }
        }
        
        p.close(); // Done with input
        p = new Scanner(System.in); // Let's start the Keyboard input
        String phrase; // Whole line phrase inputted from keyboard
        String temp; // One section of word from split phrase
        String code = ""; // Place holder for coded phrases

        System.out.println("Enter a phrase (make sure it's in the list): ");

        phrase = p.nextLine(); // Grab a phrase from the keyboard

        while (!phrase.isEmpty()) { // While the word isn't empty - we haven't looked through each word yet
            if (phrase.indexOf(32) != -1) { // If we have a space in this word which indicates multiple words in the phrase
                int space_index = phrase.indexOf(32); // Grab the exact spot where the space is
                temp = phrase.substring(0, space_index); // Take the first word out of the phrase
                phrase = phrase.substring(space_index + 1); // Get rid of the first word in the phrase since we saved it
            } else { // Otherwise, assume there are no other words left
                temp = phrase; // Temp is phrase, to be evaluated
                phrase = ""; // Phrase is now empty
            }

            if (list.contains(temp)) { // If the list contains the word in temp
                int index = list.indexOf(temp); // Find at which index that word is 
                int next = index + 1; // Get the next index to assemble the code word
                if (next > (list.size()) - 1) { // If next is bigger than the list - aka at the end of the list
                    code += list.get(0) + " "; // Add the head to the code phrase
                } else { // Otherwise add the word after to the code phrase
                    code += list.get(next) + " ";
                }
            } else { // If one or more words not found in the phrase, print this warning - better than nothing
                System.out.println("Warning: 1 or more words was not found in the list of phrases.");
            }
        }

        System.out.println("Coded Phrase: " + code); // Finally, print the code word
    }
}
