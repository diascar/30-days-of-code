package linkedlist;

public class Node<T> {

    public Node<T> next;
    T data;

    public Node(T newData) {
        this.data = newData;
        this.next = null;
    }

    public Node(T newData, Node<T> newNext) {
        this.data = newData;
        this.next = newNext;
    }

    public T getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setData(T newData) {
        this.data = newData;
    }

    public void setNext(Node<T> newNode) {
        this.next = newNode;
    }


}