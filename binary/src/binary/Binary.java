
package binary;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Binary {

    public static void main(String[] args) {
        File inFile = new File("H6Input2.txt");
          Scanner fileInput=null;         
          String s, c;               
          try{
           fileInput = new Scanner(inFile);
                  
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        
        Stack myStack = new Stack<Integer>();
        while (fileInput.hasNext())
        {
        s = "";
        //input an integer, call it num
        int num = fileInput.nextInt();
        do{
        //put num mod 2 on the stack
        myStack.push(num%2);
        //num = num/2
        num = num/2;
        //continue until num<2
        }while (num>=2);
        //if num = 0, we already have an empty string
        if (num==1) s = "1";
       //Else create a string s=”1”
        //While the stack is not empty
        while(!myStack.isEmpty())
        {
            //Pop the stack and concatenate with s
            s=s+myStack.pop();
        }
            //output num and  s
        System.out.println(s);

    }
    }
    
}
