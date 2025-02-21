/*Create a program that collects integers input from the keyboard and puts them
into a doubly linked list. 
These integers can be positive or negative. The last one should be zero.
Print the list both forwards and backwards.
Then traverse the list doing the following:
If the item in the node was negative, make it positive.
If the item was positive then double it.
Do not do both, so if you initially had a negative number do NOT make it positive and then double it. 
Print it forwards and backwards (this proves you maintained it as a doubly linked list).
 
 */
package l3;

import java.util.Scanner;

public class L3 {

   public static class Node {
    Object item;
    Node next;
    Node prev;
  
  Node(Object newItem)
  { item = newItem;
    next = null;
    prev = null;
  }
  
  Node(Object newItem, Node nextNode, Node prevNode)
  { item = newItem;
    next = nextNode;
    prev = prevNode;
  }
    
}
    public static void main(String[] args) {
       Node head = createList(); //create the list
       printForwards(head);
       printBackwards(head);
      head=fixUpList(head);  //alter it
      printForwards(head);
       printBackwards(head);
    }
    
    public static Node createList()
    {  Scanner scnr=new Scanner(System.in);
     System.out.println("Enter integers, zero to end");
     int num = scnr.nextInt();
     Node head=null;
     Node tail=null;
     while(num!=0)
     { 
         if(head == null){
             head = new Node(num);
             tail = head;
         } else {
             Node newN = new Node(num, null, tail);
             tail.next = newN;
             tail = newN;
         }
         
      num = scnr.nextInt();
     }
        return head;
    }//end createList
    
    public static Node fixUpList(Node head)
    { 
        Node curr = head;
        
        while(curr != null){
            int value = (int) curr.item;
            if(value < 0){
                curr.item = -value;  
            }
            else{
                curr.item = value * 2;
            }
            curr = curr.next;
        }
        
        return head;
    }//end fixUpList
        
    public static void printForwards(Node head)
    { Node curr=head;
     while(curr!=null)
     {
         System.out.print(curr.item + " ");
         curr=curr.next;
     }
     System.out.println();
    }//end printForwards
    
    public static void printBackwards(Node head)
    { Node curr=head;
     while(curr!=null && curr.next != null){
         curr = curr.next;
     }
     while(curr!=null)
     {
         System.out.print(curr.item + " ");
         curr=curr.prev;
     }
    
     System.out.println();
    }//end printBackwards
}
