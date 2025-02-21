/*
 * Program to demonstrate modeling a stack as a doubly linked list
 */
package stackwithdoublylinkednodes;


public class StackWithDoublyLinkedNodes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> s = new Stack<Integer>();

        Integer[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < x.length; i++) {
            Integer t = x[i];
            s.push(t);
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        
        //verify the stack is empty and that
        //we took care of the issues
        //of trying to pop an empty stack
        //and peek at the top of an empty stack
        System.out.println(s.pop());       
        System.out.println(s.peek());
        System.out.println("********************************");
        //repeat using a stack of Strings
         System.out.println("Repeat using a Stack of Strings"); 
        Stack<String> s1 = new Stack<String>();

        String[] x1 = {"Hi", "Bye", "One", "Four","CMPSC"};

        for (int i = 0; i < x1.length; i++) {
            String t1 = x1[i];
            s1.push(t1);
        }
        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }
    }

}
