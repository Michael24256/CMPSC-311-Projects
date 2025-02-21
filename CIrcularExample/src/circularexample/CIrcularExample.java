/*
 * circular list with doubly linked nodes
 */
package circularexample;


public class CIrcularExample {

    
    public static void main(String[] args) {
        int[] myArray = {34, 89, 48, 12, 9, 30, -3, 2, 46};
        
        Node head = new Node(myArray[0]); //put first item in list 
        head.next = head;
        head.prev=head; //it is now circular
       
        Node tail=null; //tail pointer
        for (int i = 1; i<myArray.length; i++)
        { Node temp= new Node(myArray[i]); //make a new node
           if(tail==null) //special case, there is only one node in the list
           { //insert before head
               temp.next=head;
               head.prev=temp;
               head.next=temp;
               temp.prev=head;
               tail=temp;
           }
           else  //tail already points to node in front of head
           {  temp.next=head;
           temp.prev=tail;
           head.prev=temp;
           tail.next=temp;
           tail = temp;
           }
        }
        Node curr=head;
        for(int k=0; k<myArray.length; k++)
        {System.out.println(curr.item);
        curr=curr.prev;
        }
        System.out.println("Check it is circular");
        Node curr2=head;
        for(int k=0; k<20; k++)
        {System.out.println(curr2.item);
        curr2=curr2.prev;
        }
    }
    
}
