
package avlwithstring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jean Mehta
 */
public class AvlWithString {

    
    public static void main(String[] args) {
       File inFile = new File("words_no_duplicates.txt");
          Scanner fileInput=null;
         Scanner file2=null;
          String s;
        try{
           fileInput = new Scanner(inFile);
          file2=new Scanner(inFile);
        }
           catch (FileNotFoundException e)
        {System.out.println(e);
        }//end
        AvlTree at=new AvlTree();
        AvlNode t =null;
        
        int totalAccesses=0;  int count=0; 
        
      
           while(fileInput.hasNext()) 
           {s = fileInput.nextLine();
           //System.out.println(s);
           t=at.insert(s,t);
           count++;
           
           }
         //print out the data - should be sorted
         System.out.println("********************************");
         System.out.println(count);
        //at.inOrder(t); 
         System.out.println("********************************");
       
      int Height=t.getHeight();
     System.out.println("Height of tree is " +  Height);
     while(file2.hasNext()) 
           {s = file2.nextLine();
           System.out.print(s+ " ");
           System.out.println(at.depth(s,t));
           totalAccesses=totalAccesses+at.depth(s,t);
          
           
           }
     System.out.println("Number of accesses to find all data in tree is " +  totalAccesses);
      System.out.println("Average number of accesses is " +  totalAccesses*1.0/count);

    }
    
}
