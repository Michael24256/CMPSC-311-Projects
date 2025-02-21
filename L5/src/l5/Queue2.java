/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;

/**
 *
 * @author michaelmanzella
 */
public class Queue2<T> {

    
    private Node head;
    private int size;
    
    public Queue2()
    {head = null;
    size=0;
    }
    
    
    public void enqueue( T item) {
      
        Node temp=new Node(item);
        if (head==null)
      { 
          head=temp;
          head.next=head;
          head.prev=head;
                  }
       else 
       if (size==1)
       {temp.next=head;
       head.next=temp;
       temp.prev= head;
       head.prev=temp;
       
       }
                  
        else{
        Node tail = head.prev;
            tail.next=temp;
            temp.prev=tail;
            temp.next=head;
            head.prev=temp;
           
        }
        size++;   }
        
  public T dequeue() {
      if (size==1)
      {T data = (T)head.item;
       head=null;
       size=0;
      return data;
      }
      else
      {
      Node temp=head;
      Node tail = head.prev;
      head=head.next;
      tail.next=head;
      head.prev=tail;
      temp.prev=null;
      temp.next=null;
      size--;
      return (T)temp.item;
      }
   }
   public boolean isEmpty() {
      return (size==0);
    
   }
   public int size() {
      return size;
   }
   public void makeEmpty() {
     head=null;
     size=0;
   }
   public T peek()
   {   
            
     return (T)head.item;
       
   }
    public void printQ()        
   {Node temp=head;
   for (int i=0; i<size; i++)
   { System.out.println((T)temp.item);
   temp=temp.next;
   }  
   }
 
}


