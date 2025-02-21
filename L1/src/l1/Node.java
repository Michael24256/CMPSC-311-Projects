/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l1;

/**
 *
 * @author michaelmanzella
 */
public class Node {
  
 Object item;
  Node next;
  
  Node(Object newItem)
  { item = newItem;
    next=null;
  }
  
  Node(Object newItem, Node nextNode)
  { item = newItem;
    next=nextNode;
  }
}
