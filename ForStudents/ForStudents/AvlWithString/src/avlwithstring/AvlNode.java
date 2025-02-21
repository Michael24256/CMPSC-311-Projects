/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avlwithstring;


public class AvlNode {
  
  private String value;
  
  private AvlNode left;
  
  private AvlNode right;
  
  private int height;
  
  public AvlNode() {
    
    this.value = null;
    
    left = null;
    
    right = null;
    
    height = 0;
    
  }
  
  public AvlNode(String value) {
    
    this.value = value;
    
    left = null;
    
    right = null;
    
    height = 0;
    
  }
  
  public String getValue() {
    
    return value;
    
  }
  
  public void setValue(String value) {
    
    this.value = value;
    
  }
  public AvlNode getLeft() {
    
    return left;
    
  }
  public void setLeft(AvlNode left) {
    
    this.left = left;
    
  }
  public AvlNode getRight() {
    
    return right;
    
  }
  public void setRight(AvlNode right) {
    
    this.right = right;
    
  }
  public int getHeight() {
    
    return height;
    
  }
  public void setHeight(int height) {
    
    this.height = height;
    
  }
  
}
