package linkedList;

public class Node {

    int data;
    Node next;

    //Constructor
    Node(int d) {
        this.data = d;
        this.next = null;
    }

    // getters

    public int getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    //setters

    public void setData(int d) {
        this.data = d;
    }

    public void setNext(Node N) {
        this.next = N;
    }


    // public static void main(String[] args)
}