
package h10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class H10 {

    
    public static void main(String[] args) {
        File inFile = new File("H10input.txt");
          Scanner fileInput=null;
          Scanner scnr = new Scanner(System.in);
             
        try{
         fileInput = new Scanner(inFile);
             
        }
           catch (FileNotFoundException e)
        {System.out.println(e);
        }//end catch
    BST myTree = new BST();
       BinaryTreeNode root =myTree.getRoot();
    while(fileInput.hasNext())
    {
       String a = fileInput.next();
            String b = fileInput.next();
            String c = fileInput.next();
            String d = fileInput.next();
            Person x = new Person(a, b, c, d);
            //x.writeOutput();
          root =myTree.insert(root, x);  

    }
        System.out.println("print in main"); 
myTree.inOrder(root);
  
   
    int choice;
    
    
    choice = menu();
    while(choice !=5)
    {
    System.out.println("choice was " + choice);
    
    switch (choice)
    {
        case 1: Person p = getPerson();
                root = myTree.insert(root, p);  break;
        case 2: System.out.println("Enter the last name of the person you are looking for");
                String lastName=scnr.nextLine();
                myTree.searchName(root, lastName);
                 break;
        case 3: myTree.inOrder(root); 
                break;
        case 4: System.out.println("Enter the month as a 2 digit integer 01-12");
                String month=scnr.nextLine();
                System.out.println("month was " + month);
                myTree.searchMonth(root, month);
                 break;
        default: System.out.println("default");
    }
            
     choice = menu();
    }
}//main
    
    public static int menu()
            {
               Scanner scnr=new Scanner(System.in);
               int choice;
               do
               {
               System.out.println("Please choose what you want to do. Enter 1-5");
               System.out.println("1: Add another person to the data");
               System.out.println("2: Search for a person and output all data for that person");
               System.out.println("3: List everyone and their data");
               System.out.println("4: List everyone who was born in a specific month");
               System.out.println("5: Quit");
               
               choice = scnr.nextInt();
               } while (choice<1||choice>5);
               return choice;
               
               
               
            }
    
    public static Person getPerson()
    {  Scanner scnr=new Scanner (System.in);
       System.out.println("Enter the first name of the person to be added");
       String a = scnr.next();
       System.out.println("Enter the last name of the person to be added");
       String b = scnr.next();
       System.out.println("Enter the birthday of the person to be added");
       System.out.println("In the form mm/dd/yyyy");
       String c = scnr.next();
       System.out.println("Enter the telephone number of the person to be added");
       System.out.println("In the form 123-456-7890");
       String d = scnr.next();
       Person p = new Person(a, b, c, d);
       return p;  
    }
    public static BST <Person> createTree()
    {
        File inFile = new File("H10input.txt");
          Scanner fileInput=null;
             
        try{
         fileInput = new Scanner(inFile);
             
        }
           catch (FileNotFoundException e)
        {System.out.println(e);
        }//end catch
    BST <Person> myTree = new BST();
       BinaryTreeNode <Person> root =myTree.getRoot();
    while(fileInput.hasNext())
    {
       String a = fileInput.next();
            String b = fileInput.next();
            String c = fileInput.next();
            String d = fileInput.next();
            Person x = new Person(a, b, c, d);
            //x.writeOutput();
          root =myTree.insert(root, x);  
    }
        System.out.println("PRINTING FROM METHOD   ");
        myTree.inOrder(root);
    return myTree;
    }
    
    
}//class

        
          
            
        
        