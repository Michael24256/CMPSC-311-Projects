/* We input the words from words.txt into a Queue (a circular queue) 
We then input an integer (n). 
Then starting at the head of the queue  
every nth node is deleted until only one node remains. 
The String in that last node is then printed. 

*/
package circularq;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CIrcularQ {

    
    public static void main(String[] args) {
        Queue<Integer> q= new Queue<Integer>();
        
         Queue<String> myList = new Queue<String>();  //create the list
              input(myList);                 //input into the list
         Scanner  keyboard = new Scanner(System.in);
          //prompt user for n
            System.out.println("Enter an integer n");
            System.out.println("so we can delete every nth item in the list");
            int n = keyboard.nextInt();
           myList.delete(n);
         System.out.println("******************");
        myList.print();
        
    }// end main
    
    public static void input (Queue myQ)
    {  //This method inputs from a textfile and adds to a circular
            //linked list 
            //It returns (by parameter) the new list
             String fileName = "words.txt";
            Scanner inputStream=null;
     try 
        {
            //input items from Ex.txt into circular list.
           
            File input = new File(fileName);
            inputStream = new Scanner(input);
    
               
    }
    catch (FileNotFoundException e) 
        {
            System.out.println(e);
        }
    while (inputStream.hasNext()) 
            //while there is input, add to the list
            myQ.enqueue(inputStream.next());  //end while loop
    
}

    
}
