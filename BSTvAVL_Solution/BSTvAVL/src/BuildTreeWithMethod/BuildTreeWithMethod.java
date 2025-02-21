/*
 * This program builds a BST with integers, 
 * performs an inorder traversal to verify correctness of the build
 * and then calculates the number of accesses to find all data in the tree and 
 * the average number of accesses to find any element in the tree. 
 */
package BuildTreeWithMethod;
 import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BuildTreeWithMethod {

    public static void main(String[] args) {
      
        File inFile = new File("words_no_duplicates.txt");
          Scanner fileInput=null;
    
          String s;
        try{
           fileInput = new Scanner(inFile);
          
        }
           catch (FileNotFoundException e)
        {System.out.println(e);
        }//end
       
        
       s = fileInput.nextLine();
       
           
       BinaryTreeNode<String> root=new BinaryTreeNode<String>(s);//the root
       int totalAccesses=1;  int count=1; //for the root
           while(fileInput.hasNext()) 
           {s = fileInput.nextLine();
           //System.out.println(s + count);
           TreeInsert(root, s);
           totalAccesses=totalAccesses+Accesses(root, s);
           count++;
           }
         //print out the data - should be sorted
       System.out.println("Number of nodes  in tree is " +  count);
        System.out.println("Number of accesses to find all data in tree is " +  totalAccesses);
      System.out.println("Average number of accesses is " +  totalAccesses*1.0/count);
     System.out.println("Height of tree is " +  Height(root));
        
       
    }
     //method to perform- an inorder traversal of a BST
        public static void inOrder(BinaryTreeNode t) {
        if (t != null) 
        {
         inOrder(t.getLeft());
         System.out.println(t.getValue());
         inOrder(t.getRight());

    }
        }
      
       //method to insert an integer (num) into a non-null BST tree 
       
       
        public static <T extends Comparable>void TreeInsert(BinaryTreeNode <T>curr, T num)
        {     BinaryTreeNode b=new BinaryTreeNode(num);
              
                while (curr != null) {
               T currValue= (T)curr.getValue();
                if(num.compareTo(currValue)<0){
                    if (curr.getLeft() == null) {
                        curr.setLeft(b);
                        
                        break;
                    } else {
                        curr = curr.getLeft();
                        
                    }

                } else {
                    if (curr.getRight() == null) {
                        curr.setRight(b);
                       
                        break;
                    } else {
                        curr = curr.getRight();
                       
                    }
                }
            }
                
              
               
        }
       
        public static <T extends Comparable> int Accesses(BinaryTreeNode<T> root, T num)
        { BinaryTreeNode<T> curr=root;
        int Accesses=1;
        while(curr!=null)
        { Object s= curr.getValue();
         if (num.equals(s))break;
         else if (num.compareTo(s)<0)
         {curr=curr.getLeft();Accesses++;}
         else {curr=curr.getRight();Accesses++;}
         
        }
      // System.out.println(curr.getValue() + " " + Accesses);
        return Accesses;
        }
         public static <T extends Comparable> int Depth(BinaryTreeNode<T> root, T num)
         {
             return Accesses(root, num)-1;
         }
         public static <T extends Comparable> int Height(BinaryTreeNode<T> root)
         {  
         if(root==null)return -1;
         if((root.getLeft()==null)&&(root.getRight()==null))return 0;
         else {int Left=Height(root.getLeft());
         int Right=Height(root.getRight());
           if (Left>Right)return Left+1;
           else return Right+1;
            
         }
         }
         
}

    

