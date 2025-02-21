/*
 * Models a BST as a 2 dimensional array. Outputs the array
 */
package l8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;


public class L8 {

    public static void main(String[] args) {
        int[][] myArray = createArray();
        printArray(myArray);
       
    }
     public static int[][] createArray()
    {Scanner br = null;
        FileReader fr = null;   
        

        try {

            fr = new FileReader("lab8.txt");
            br = new Scanner(fr);
         
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found");
        

        }
        //load array initially. All LC and RC = -1
        int numrows= br.nextInt();
        int[][]arr = new int[numrows][3];
         for (int i=0; i<numrows; i++) { 
        arr[i][0]=br.nextInt();
        arr[i][1]=-1;
        arr[i][2]=-1;
}
         int insert = 1;//index of number to be inserted
         int curr = 0; //index currently being looked at
        for (insert=1; insert<numrows; insert++)
        { 
        boolean inserted = false;
         //start at root
         curr = 0;
         while (!inserted)
         {
         if (arr[insert][0]<arr[curr][0])
         { //look at LC
             if (arr[curr][1]==-1)
             { arr[curr][1]= insert;
             inserted = true;
             }
             else curr = arr[curr][1];
         }
         else 
         { if (arr[curr][2]==-1)
         { arr[curr][2]= insert;
         inserted = true;
         }
             else curr = arr[curr][2];
         } 
         }//end while
        }  
         return arr;
    }
     public static void printArray(int[][] arr)
     {
         for(int i = 0; i<arr.length; i++)
         { for (int j=0; j<3; j++)
             System.out.print(arr[i][j] + " ");
             System.out.println("");
     }
     }
}
