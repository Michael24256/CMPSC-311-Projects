
//This program demonstrates how to add integers to a list using user input. 
//It first adds to the end of a list (append) 
//And then to the front (prepend)
//You should make sure you understand it before attempting L1

package appendprependexample;

import java.util.Scanner;

/**
 * @author mehta
 */
public class AppendPrependExample {

    
    public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);
        
      Node head = null;   //set head and tail to null
      Node tail = null;
      System.out.println("Add to the end of a list");
      System.out.println("Enter an integer, zero to quit");
      int input = scnr.nextInt();  //get first integer
      while (input !=0)
       
      { Node temp = new Node (input);  //create a node with user input as item
        
         if (head == null)  //treat null list as special case
         { head = temp;  //when inserting first node in list
           tail=temp;   // set head and tail to first node
           
         }
         else
         { //list wasn't empty
            tail.next=temp;    // tail was pointing to end of list
                                 //make tail's next point to new node
            tail=tail.next;    //and move tail on
          //tail now points to new node (which is the new end of the list)
         }
         System.out.println("Enter an integer, zero to quit"); 
         //get more input
         input = scnr.nextInt();    
      }//while
      printList(head);
      //Now repeat but adding to the front of the list (prepend)
      
      head = null;   //set head to null
      
      System.out.println("Add to the front of a list");
      System.out.println("Enter an integer, zero to quit");
      input = scnr.nextInt();  //get first integer
      while (input !=0)
       
      { Node temp = new Node (input);  //create a node with user input as item
        
         if (head == null)  //treat null list as special case
         { head = temp;  //when inserting first node in list
                      // set head  to first node  
         }
         else
         { //list wasn't empty
            temp.next=head;    // head WAS pointing to front of list
                                 //make temp's next point to head
            head=temp;    //and move head to point to temp (which is the new head)
                  }
         System.out.println("Enter an integer, zero to quit"); 
         //get more input
         input = scnr.nextInt();    
      }//while
      printList(head);

    }
     public static void printList(Node head)
   { Node curr=head;
      while(curr!=null)
      {
         System.out.println(curr.item);
         curr=curr.next;
      }
   }

    
}
