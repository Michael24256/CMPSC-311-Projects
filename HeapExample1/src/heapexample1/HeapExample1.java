/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapexample1;

/**
 *
 * @author Jean Mehta
 */
public class HeapExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[]data = {56,8,13,41,5,104,11,39,57,62,90,60};
        Integer[] heap = CreateHeap(data);
        
        for (int j=0; j<12; j++)
            System.out.print(heap[j]+ " ");
       
     return;   
    }
     public static Integer[] CreateHeap(Integer[]data)
    { Integer[] heap = new Integer[12];
   
    heap[0]=data[0];
        for(int i=1; i<12; i++)
        { //insert data[n]
            heap[i]=data[i];
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
    }
    

