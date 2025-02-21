/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l62;

/**
 *
 * @author michaelmanzella
 */


 import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class L62 {

    public static void main(String[] args) {
      
        Integer[] arr = {6, 8, 3, 4, 9, 2 };  //data to put in BST
              
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(arr[0]);//the root
        int totalComparisons=0;                    //# accesses to insert the root
        
        //build the tree
        for (int i = 1; i < arr.length; i++) {
            
           TreeInsert(root, arr[i]);    
           
        }
        //print out the data - should be sorted
        inOrder(root);
        //count access to retrieve all data
        for (int i = 0; i < arr.length; i++) {
            
           totalComparisons=totalComparisons+Comparisons(root, arr[i]);
           
        }
       
      System.out.println("Number of comparisons to find all data in tree is " +  totalComparisons);
      System.out.println("Average number of comparisons is " +  totalComparisons*1.0/arr.length);
      
      //repeat with strings from a file
      System.out.println("File of strings");
      File inFile = new File("words2.txt");
          Scanner fileInput=null;
        
          String s;
        try{
           fileInput = new Scanner(inFile);
         
        }
           catch (FileNotFoundException e)
        {System.out.println(e);
        }//end 
        //first deal with root
        s = fileInput.nextLine();
        totalComparisons=1;  int count=1;    
       BinaryTreeNode<String> root1=new BinaryTreeNode<String>(s);//the root
       //now input into this tree
           while(fileInput.hasNext()) 
           {s = fileInput.nextLine();
           TreeInsert(root1, s);
           //calculate the number of comparisons to find this string and add to total
           totalComparisons=totalComparisons+Comparisons(root1, s);
           count++;
           }
         //print out the data - should be sorted
        inOrder(root1);  
        System.out.println("Number of comparisons to find all data in tree is " +  totalComparisons);
      System.out.println("Average number of comparisons is " +  totalComparisons*1.0/count);
     
        
        
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
        public static void TreeInsert(BinaryTreeNode curr, Integer num)
        {     BinaryTreeNode b=new BinaryTreeNode(num);
              
                while (curr != null) {
               int currValue= (int)curr.getValue();
                if(num<currValue){
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
        //method to count the number of comparisons to find an integer (num) in a non-empty BST
        public static int Comparisons(BinaryTreeNode root, Integer num)
        { BinaryTreeNode curr=root;
        int Comparisons=1;
        while(curr!=null)
        {
         if (num==curr.getValue())break;
         else if (num<(Integer)curr.getValue())
         {curr=curr.getLeft();Comparisons++;}
         else {curr=curr.getRight();Comparisons++;}
         
        }
        return Comparisons;
        }
         //method to insert an String (num) into a non-null BST tree 
        public static void TreeInsert(BinaryTreeNode curr, String num)
        {     BinaryTreeNode b=new BinaryTreeNode(num);
              
                while (curr != null) {
               String currValue= (String)curr.getValue();
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
        //method to count the number of comparisons to find a String (num) in a non-empty BST
        public static int Comparisons(BinaryTreeNode root, String num)
        { BinaryTreeNode curr=root;
        int Comparisons=1;
        while(curr!=null)
        { String s= (String)curr.getValue();
         if (num.equals(s))break;
         else if (num.compareTo(s)<0)
         {curr=curr.getLeft();Comparisons++;}
         else {curr=curr.getRight();Comparisons++;}
         
        }
       
        return Comparisons;
        }
        
}

    

