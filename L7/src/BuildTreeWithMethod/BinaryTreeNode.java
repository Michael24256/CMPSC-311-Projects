/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildTreeWithMethod;

public class BinaryTreeNode<T> 
{
   private T element;
   private BinaryTreeNode<T> left, right;

  
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

