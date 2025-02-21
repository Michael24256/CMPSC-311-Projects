/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1;

/**
 *
 * @author michaelmanzella
 */
import java.util.Scanner;

//@author Jean Mehta
 
public class L1 {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Node tail = null;
        Node head = null;

        System.out.println("Please enter the number of feet and inches separated by space, enter 0 0 to quit");
        int feet = keyboard.nextInt();
        int inches = keyboard.nextInt();

        while (feet != 0 || inches != 0) {
            FeetAndInches measurement = new FeetAndInches(feet, inches);
            Node newNode = new Node(measurement);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            System.out.println("Please enter the number of feet and inches separated by space, enter 0 0 to quit");
            feet = keyboard.nextInt();
            inches = keyboard.nextInt();
        }

        PrintList(head);
    }

    public static void PrintList(Node head) {
        Node curr = head;
        FeetAndInches m;

        while (curr != null) {
            m = (FeetAndInches) curr.item;
            System.out.println(m);
            curr = curr.next;
        }
    }
}


