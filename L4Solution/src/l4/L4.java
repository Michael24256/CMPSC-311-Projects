/*
 * Inserts integers into a circular list, prints it
 then deletes nodes with even integers and prints list
 */
package l4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class L4 {

    public static void main(String[] args) {
     
        Node head = createInitialList();
        printList(head);
        head=deleteEven(head);
        System.out.println("");
        printList(head);
       
    } //end main
    
     public static Node createInitialList() { 
        File f = new File("H5a.txt"); // Text file
        Scanner p = null; // Scanner for both File IO and Keyboard input
        Node head = null; 
        Node tail=null;
        try {
            p = new Scanner(f); // Create the scanner to read the file
        } catch (FileNotFoundException e) { // Exit if bad things happen
            System.out.println("File not Found!");
            System.exit(-1);
        }
        
        while (p.hasNext()) { 
            // While we still have text in the file
            int num  = p.nextInt(); 
            Node temp = new Node(num);
            
            if (head == null) {
                head = temp;
                tail = temp;
            } 
            //if not, set the next node to x
            else {
                tail.next = temp;
                tail = temp;
            }  
        } //end while        
               tail.next=head;
         return head;
      }  //end createInitialList
     
    public static void printList(Node head)
     { System.out.println("printing list");
         Node curr = head;
         while(curr.next!=head)
           
         { System.out.print(curr.item + " ");
          curr=curr.next;
         }
         System.out.println(curr.item);
         
     }
                      
     public static Node deleteEven(Node head) {
        //set curr equal to head
        Node curr=head;
        //cast as Integer
        int z = (int)curr.item;
        //loop while z is even
        while(z%2==0) {
            //move curr
            curr=curr.next;
            //get item and cast
            z=(int)curr.item;
            //if all numbers are even get out of loop
            if(curr==head) {
                return null;
            }
        }
        //move head to the first odd number
        head=curr;
        //make new node
        Node currNext=curr.next;
        //loop while curr isn't head
        while(curr.next!=head) {
            int x=(int)currNext.item;
            //while x is even
            while(x%2==0) {
                //move currNext
                currNext=currNext.next;
                //get item and cast
                x=(int)currNext.item;
            } //end while
            //set curr.next equal to currNext
            curr.next=currNext;
            //set curr equal to currNext
            curr=currNext;
            //set currNext equal to curr.next
            currNext=curr.next;
        } //end while

     return head;
     } //end deleteEven
} //end class

    

