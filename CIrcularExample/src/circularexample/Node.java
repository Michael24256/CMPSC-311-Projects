/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularexample;


public class Node {
    public Object item;
    public Node prev;
    public Node next;
    
    public Node(Object it)
    {item=it;
    next=null;
    prev=null;
    }
}
