/*
 * Recursive BST methods
This program creates an array with 10 random integers, then builds a
BST from this. An inorder traversal proves that it was correctly built.
It then creates another tree with strings, and performs an inorder 
traversal on that to show it was built correctly. 
 */
package BuildTreeWithMethod;

import java.util.Random;

public class BuildTreeWithMethod {

    public static void main(String[] args) {
      
       Integer[] arr = new Integer[10];  //array to hold generated integers
        CreateArray(arr);        //fill the array
       
        BinaryTreeNode<Integer> root = null;
       
        for (int i = 0; i < arr.length; i++) {
          
            root=TreeInsert(root, arr[i]);
        }
        inOrder(root);

        String [] sArray = {"Hi", "Bye", "Monday", "April", "Donkey"};
        
        BinaryTreeNode <String>root1=null;
        for (int i = 0; i < sArray.length; i++) {
  
            root1=TreeInsert(root1, sArray[i]);
        }
        inOrder(root1);
    }
   
        public static void inOrder(BinaryTreeNode t) {
        if (t != null) 
        {
         inOrder(t.getLeft());
         System.out.println(t.getValue());
         inOrder(t.getRight());

    }
        }
        public static void CreateArray(Integer[] arr)
        { Random generator = new Random();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = generator.nextInt(200);
        }
        }
        public static <T extends Comparable>BinaryTreeNode TreeInsert(BinaryTreeNode curr, T num)
        {    
               if (curr == null) {
                   BinaryTreeNode b=new BinaryTreeNode(num);
                    curr=b; 
                return curr;}
           else
               { if(num.compareTo((T) curr.getValue())<0)
                    curr.setLeft(TreeInsert(curr.getLeft(), num));
                        
                     else 
                         curr.setRight(TreeInsert(curr.getRight(), num));
                    return curr;
               }

                 
            }//end rec method
        }

    

