//This program creates three nodes and inserts them into a linked list
//it then prints the list
package example1;

public class Example1 {

    
    public static void main(String[] args) {
    
        //create node called first, data item is an Integer value 46
        Node first = new Node (46);
        //create node called second, data item is floating point value 2.6
        Node second = new Node(2.6);
        //create node called third, data item is the String "Hi"
        Node third = new Node ("Hi");
        //add nodes to list. Make first the head, then second, then third.
        Node head = first;
        first.next=second;
        second.next=third;
        printList(head);
        
        
//        Node head2 = new Node(46);
//        head2.next = new Node(2.6);
//        head2.next.next= new Node("hi");
//        //print list
//        printList(head2);
//        
        Node head1 = new Node(46);
        Node curr = head1;
        curr.next=new Node(2.6);
        curr=curr.next;
        curr.next= new Node("HI");
        
        printList(head1);
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
