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
       Scanner scnr=new Scanner(System.in);
        Integer[] arr = {6, 8, 3, 4, 9, 2 };  //data to put in BST
              
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(arr[0]);//the root
        int totalComparisons=0;                    //# accesses to insert the root
        
        //build the tree
        for (int i = 1; i < arr.length; i++) {
            
           TreeInsert(root, arr[i]);    
           
        }
        //print out the data - should be sorted
        inOrder(root);
        System.out.println("");
        //count comparisons to retrieve all data
        for (int i = 0; i < arr.length; i++) {
            
           totalComparisons=totalComparisons+Comparisons(root, arr[i]);
           
        }
       
      System.out.println("Number of comparisons to find all data in tree is " +  totalComparisons);
      System.out.println("Average number of comparisons is " +  totalComparisons*1.0/arr.length);
      System.out.println("Height of tree is " +  Height(root));
        System.out.println("Input an integer to determine its depth");
        System.out.println("You can choose 2, 3, 4, 6, 8, or 9 ");
        int number=scnr.nextInt();
        System.out.println("The depth of " + number + " is "+ Depth(root, number));
        
        
      System.out.println("****************File of strings");
      File inFile = new File("words3.txt");
          Scanner fileInput=null;
        
          String s;
        try{
           fileInput = new Scanner(inFile);
         
        }
           catch (FileNotFoundException e)
        {System.out.println(e);
        }//end 
        s = fileInput.nextLine();
        totalComparisons=1;  int count=1;    
       BinaryTreeNode<String> root1=new BinaryTreeNode<String>(s);//the root
           while(fileInput.hasNext()) 
           {s = fileInput.nextLine();
           TreeInsert(root1, s);
           totalComparisons=totalComparisons+Comparisons(root1, s);
           count++;
           }
         //print out the data - should be sorted
        //inOrder(root1);  
        System.out.println("Number of comparisons to find all data in tree is " +  totalComparisons);
      System.out.println("Average number of comparisons is " +  totalComparisons*1.0/count);
     System.out.println("Height of tree is " +  Height(root1));
        
        System.out.println("Input a string to determine its depth");
        
        String str=scnr.next();
        System.out.println("The depth of " + str + " is "+ Depth(root1, str));
    }
     //method to perform- an inorder traversal of a BST
        public static void inOrder(BinaryTreeNode t) {
        if (t != null) 
        {
         inOrder(t.getLeft());
         System.out.print(t.getValue() + " ");
         inOrder(t.getRight());

    }
            
        }
      
       //method to insert an object into a non-null BST tree 
       
       
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
      //method to calculate the number of comparisons to find an object (num) in a non-empty BST 
        public static <T extends Comparable> int Comparisons(BinaryTreeNode<T> root, T num)
        { BinaryTreeNode<T> curr=root;
        int Comparisons=1;
        while(curr!=null)
        { Object s= curr.getValue();
         if (num.equals(s))break;
         else if (num.compareTo(s)<0)
         {curr=curr.getLeft();Comparisons++;}
         else {curr=curr.getRight();Comparisons++;}
         
        }
      // System.out.println(curr.getValue() + " " + Comparisons);
        return Comparisons;
        }
        //method to find the depth of a node in a non-empty BST
         public static <T extends Comparable> int Depth(BinaryTreeNode<T> root, T num)
         {
             return Comparisons(root, num)-1;
         }
         //method to find the height of a non-empty BST
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

    

