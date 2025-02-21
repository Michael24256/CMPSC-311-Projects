/*
 This program collects integers from the user, and inserts them into a list. 
It then traverses the list, deleting each node and putting odd numbers into a list for odds
and even numbers into a list for evens. 
Finally it prints all three lists, noting the initial list is now empty.
 */
package h1;

import java.util.Scanner;

public class H1 {

    public static void main(String[] args) {

        //call the createList method 
        Node head = createList();
        
        //print the initial list
        System.out.println("The initial list");
        printList(head);
        //create two new lists, one for the even integers, one for the odd
        Node OddHead = null;
        Node EvenHead = null;
        Node OddTail = null;
        Node EvenTail = null;

        //delete from the initial list and add to the other
        while (head != null) {

            Node temp = new Node(head);

            temp = head;
            head = head.next;
            temp.next = null; //disconnect from list
            if (((int) temp.item) % 2 == 0) {//add to end of even list
                if (EvenHead == null) //if even list is empty
                {
                    EvenHead = temp;
                    EvenTail = temp;
                } else //even list was not empty
                {
                    EvenTail.next = temp;
                    EvenTail = temp;

                }
            } else {//add to end of odd list
                if (OddHead == null) //if even list is empty
                {
                    OddHead = temp;
                    OddTail = temp;
                } else //even list was not empty
                {
                    OddTail.next = temp;
                    OddTail = temp;

                }
            }
        }//end while

        //print results
        System.out.println("The list of even numbers");
        printList(EvenHead);
        System.out.println("The list of odd numbers");
        printList(OddHead);
        System.out.println("The remaining list");
        printList(head);
    }

    //create list using prepend
    public static Node createList() {
        Node head = null;
        //create scanner for input
        Scanner keyboard = new Scanner(System.in);
        //loop for user input
        //prompt user for input. stops at 0
        System.out.println("Enter an integer, enter 0 to quit");
        int num = keyboard.nextInt();
        //loop until input is not 0
        while (num != 0) {
            Node temp = new Node(num);
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            System.out.println("Enter an integer, enter 0 to quit");
            //next user input
            num = keyboard.nextInt();
        }
        //return head back
        return head;
    }//end createList

    public static void printList(Node head) {
        //This method prints a list
        Node curr = head;
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        //Note: no else required. 
        //we will not reach this code if list is empty
        //because of the return
        while (curr != null) {
            System.out.println(curr.item);
            curr = curr.next;
        }
    }

}//end class
    


    

