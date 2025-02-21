//this program inputs integers and outputs them sorted using Radix Sort
//it uses java's queue class

package radixsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class RadixSort {

    
    public static void main(String[] args) {
        File inFile = new File("radix.txt");
          Scanner fileInput=null;
          Queue<Integer> q=new LinkedList<Integer>(); //initial queue
          Integer num;
        try{
           fileInput = new Scanner(inFile);
        }
           catch (FileNotFoundException e)
        {System.out.println(e);
        }//end catch
           while(fileInput.hasNext()) //create initial queue
           {num = fileInput.nextInt();
           q.add(num);
           }
           RadixSort(q);  //sort it
           printQueue(q);  //print it
         
       
    }
    //method to print a queue
    public static void  printQueue(Queue<Integer> q)
    { while (!q.isEmpty())
        System.out.print(q.remove() + " ");
    System.out.println();
    }
    
    public static void RadixSort(Queue<Integer> q)
    {Queue qArray[]= new Queue[10];  //an array of queues
    for (int i=0; i<10; i++)         //create the queues in the array
    {qArray[i] = new LinkedList<Integer>();}
    
    for(int k=1; k<=1000; k=k*10)
    {while(!q.isEmpty())  //for each integer in the queue
    { 
    Integer num = q.remove();
    qArray[num/k%10].add(num);  //add it to the correct queue in the array
    }//end while 
    for(int i=0; i<10; i++)     //then remove from array queues 
    { while (!qArray[i].isEmpty())
    { Integer n=(Integer)qArray[i].remove();
        q.add(n);               //and add to main queue
    }
    }//for i

    }//for k
        
    }//radixSOrt
}
