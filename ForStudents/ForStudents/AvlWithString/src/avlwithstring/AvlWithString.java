package avlwithstring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AvlWithString {

        public static void main(String[] args) {
       File inFile = new File("words2.txt");
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
        
        s=fileInput.next();
        AvlNode root = new AvlNode(s);
        AvlTree tree = new AvlTree(root);
        while (fileInput.hasNext())
        {s=fileInput.next();
        
        root = tree.insert (s, root);
        }
        tree.inOrder(root);
    }
    
}
