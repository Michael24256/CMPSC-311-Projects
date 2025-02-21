/*
 * This program models a heap as an array
 */
package heapsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author jim1
 */
public class Heapsort {

  
    
    public static void main(String[] args) {
        Integer[] heap=CreateHeap();
        System.out.println("The original data");
       printHeap(heap);
        Integer[] sorted =HeapSort(heap);
        System.out.println("The data sorted");
         printHeap(sorted);
        
    
    }
   
    public static Integer[] HeapSort( Integer[]heap)
    {  int heapSize = heap.length;
    //dreate the array to return to main
    Integer[] sorted = new Integer[heapSize];
    //take the "root" and put in the sorted array
    for(int i= heapSize-1; i>=0; i--)
        { int w= heapSize-1-i;
         //take the "root" and put in the sorted array
      sorted[w]=heap[0];
      //take the last element and put as the root
       heap[0]=heap[i];
       Integer k=0;
       //reheap if necessary
       while(k<=(i-2)/2)
       {Integer LC = heap[2*k+1];
       Integer RC = heap[2*k+2];
       Integer biggest;
       if (LC>RC && LC>heap[k]) biggest = 2*k+1;
       else if(RC>LC && RC>heap[k]) biggest = 2*k+2;
       else break;
       //swap
       Integer temp = heap[biggest];
       heap[biggest]=heap[k];
       heap[k]=temp;
       k=biggest;
       }
       
   
        }
    return sorted;
    }
    public static Integer[] CreateHeap()
    { File inFile = new File("radix.txt");
          Scanner fileInput=null;
        try{
           fileInput = new Scanner(inFile);
        }
           catch (FileNotFoundException e)
        {System.out.println(e);
        }//end catch
       
  ArrayList<Integer> data = new ArrayList <Integer> ();
  //get data from file into an arrayList
    while(fileInput.hasNext())
        data.add(fileInput.nextInt());
    
   Integer[] heap = new Integer[data.size()];
     //move element by element from arrayList into heap
     //reheaping if necessary after each addition
    heap[0]=data.get(0);
        for(int i=1; i<data.size(); i++)
        { //insert into heap
            heap[i]=data.get(i);
        //reheap if necessary
            int n=i;
        while((n-1)/2>=0 && heap[(n-1)/2]<heap[n])
        { Integer temp=heap[(n-1)/2];
        heap[(n-1)/2]=heap[n];
        heap[n]=temp;
        n=(n-1)/2;
        }
        }
    return heap;
        
    }
    public static void printHeap(Integer[]h)
    {  //prints the heap
        
        for (int i=0; i<h.length; i++)
            System.out.println(h[i]);
        System.out.println("**********************");
    }
    }
    

