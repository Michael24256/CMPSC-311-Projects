/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l62;

/**
 *
 * @author michaelmanzella
 */
public class BinaryTreeNode<T> 
{
   private T element;
   private BinaryTreeNode<T> left, right;

   /**
    * Creates a new tree node with the specified data.
    *
    * @param obj  the element that will become a part of the new tree node
   */
   BinaryTreeNode (T obj) 
   {
      element = obj;
      left = null;
      right = null;
   }

   public T getValue(){
       return  element;
   }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }
    
     
    
    


}


