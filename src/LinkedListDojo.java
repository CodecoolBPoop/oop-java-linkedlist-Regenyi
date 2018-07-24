import java.util.*;

public class LinkedListDojo { //learnt: can't use util name!!!!
    private Node head;
    private int size;

    // Constructs an empty list
    LinkedListDojo () {
        head = null;
        size = 0;
    }

    void add(Object item) {
        Node temp = new Node(item);
        Node curr = head;

        if (head == null) {
            head = temp;
        } else {
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(temp);
        }
    }

    public Object getItemAt(int index) {
        Node curr = head;
        for (int i = 0; i < index; i++){
            curr = curr.getNext();
        }

        return curr.getData();
    }

        //head / tail / length / insert / remove

    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }

        Node getNext() {
            return this.next;
        }

        public Object getData() {
            return this.data;
        }

        void setNext(Node nextNode) {
            this.next = nextNode;

        }
    }

    public static void main(String[] args) {
        LinkedListDojo sList = new LinkedListDojo();
        for (int i = 0; i < 33; i++) {
            sList.add("aaa"+i);
        }
        System.out.println(sList.getItemAt(30));
    }
}
