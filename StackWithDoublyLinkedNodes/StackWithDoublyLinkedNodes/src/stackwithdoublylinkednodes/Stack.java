/*
 *Stack as a doubly linked list
 */
package stackwithdoublylinkednodes;


public class Stack<T> {

    private Node head;
    private int size;

    Stack() {
        head = null;
        size = 0;
    }

    public void push(T newItem) {
        Node temp = new Node(newItem);
        if (this.isEmpty()) {
            head = temp;
        } else {
            temp.setNext(head);
            head.setPrev(temp);
            head = temp;
        }
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            return (T)"Empty List";
        }
        T temp = (T) head.getItem();
        head = head.getNext();
        if (head != null) {
            head.setPrev(null);
        }
        size--;
        return temp;
    }

    public T peek() {
        if(isEmpty()){
            return (T)"Empty List";
        }
        return (T) head.getItem();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
