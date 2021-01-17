
public class LinkedList {

    //attributes
    Node head;
    //keeping track of the size of our linked list
    int count;

    //constructors
    public LinkedList() {
        head = null;
        
        count = 0;
    }

    public LinkedList(Node newHead) {
        head = newHead;
        count = 1;
    }

    //methods

    public void add(int newData) {
        Node tmp = new Node(newData);
        Node current = head;
        while (current.next != null) {
            current = current.getNext();
        }
        current.setNext(tmp);
        count++;
    }

    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getNext();
    }

    public int size() {
        return count;
    }

    public boolean isEmtpy() {
        return head == null;
    }

    public void remove() {
        //remove the last element of the list
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext)();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {

    }
}