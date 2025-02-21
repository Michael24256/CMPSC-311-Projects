/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentlist1;

import java.util.*;
public class StudentList1 {

   
    public static void main(String[] args) {
       Student one = new Student ("Matt", 37);
     Student two = new Student ("Mary", 17);
       Student three = new Student ("Todd", 20);
         Student four = new Student ("Diane", 25);
           Student five = new Student ("Marty", 21);
       
            LinkedList <Student>myList = new LinkedList<Student>();
            myList.add(one);
            myList.add(two); 
            myList.add(three);
            myList.add(four);
            myList.add(five);
            
             Iterator<Student> iter;
            iter= myList.listIterator(); 
            while(iter.hasNext())
                System.out.println(iter.next());
            
    }
    
}
