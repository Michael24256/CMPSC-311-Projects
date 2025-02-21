/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularq;


public class Queue <T> {
    private int size=0;
    private Node head;
    private Node tail;
    public Queue()
    {head=null;
    tail=null;
    size=0;
    }
    public void enqueue(T item)
    {
        Node temp=new Node(item);
        if(head==null)
        {head=temp;
        tail=temp;
        }
        else 
        {temp.next=head;
         tail.next=temp;
         tail=temp;
        }
        size++;
    }
    public T dequeue()
    {
        Node temp=head;
        head=head.next;
        tail.next=head;
        size--;
        return (T)temp.item;
            
        }
    public void print()
    {
        Node temp=tail.next;
        for (int i=0; i<size; i++)
        {
            System.out.println((T)temp.item);
            temp=temp.next;
        }
    }
    public void delete(int n)
    {  //starting at the tail
        Node temp=tail;
        //delete every nth node
        while(size>1)
        { for (int i=1; i<n; i++)
            temp=temp.next;
           //delete the next node
       
           temp.next=temp.next.next;
           size--;
        }
        tail=temp;
    }
}
