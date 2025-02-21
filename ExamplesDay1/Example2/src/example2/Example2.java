//This program creates two nodes and inserts them into a linked list
//it then prints the list

package example2;

/**
 *
 * @author Jean Mehta
 */
public class Example2 {

    
    public static void main(String[] args) {
        //create several nodes, data items are of type FeetAndInches
        //add nodes to list
        FeetAndInches d = new FeetAndInches(3,6);
        Node head = new Node(d);
        Node curr = head;
        FeetAndInches e = new FeetAndInches(6,6);
        curr.next= new Node(e);
        curr=curr.next;
        FeetAndInches f = new FeetAndInches(4,8);
        curr.next=new Node(f);
        printList(head);
    }
    public static void printList(Node head)
    {  //prints the list 
        Node curr=head;
        while(curr!=null)
        {System.out.println(curr.item);
        curr=curr.next;
        }
    
}
}
