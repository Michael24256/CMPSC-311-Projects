
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listexample1;
import java.util.*;

public class ListExample1 {

    public static void main(String[] args) {
      Integer[] a = {105, 79, -3, 82, 36, 49, 990, -45, -13, 467};
 
 
     LinkedList <Integer>yourList = new LinkedList<Integer>(); //not sorted
     LinkedList <Integer>oddList = new LinkedList<Integer>(); 
     LinkedList <Integer>evenList = new LinkedList<Integer>(); 
  
    for (int i=0; i<10; i++)
        yourList.add(a[i]);

 // *************print this list
 //look at each list item
 //remove from list
 while (yourList.size()>0)
 {int temp= yourList.remove();
 if(temp%2==0)evenList.add(temp);
 else oddList.add(temp);
 }
 //add to either odd or even list
 //print out all lists
 
   Iterator<Integer> iter;
   iter= yourList.listIterator(); 
    while (iter.hasNext())
     System.out.print(iter.next()+ " ");
     System.out.println();

  //print again
    System.out.println(yourList);
    System.out.println(oddList);
    System.out.println(evenList);
    //print again

   /* for (int i=0; i<yourList.size(); i++)
        System.out.print(yourList.get(i));
     
     */
    }
    
}
