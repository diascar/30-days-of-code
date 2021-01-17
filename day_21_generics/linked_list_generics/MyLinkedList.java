package linkedlist;

import java.util.LinkedList;

public class MyLinkedList<T> {

    Node<T> head;
    int count;

    public MyLinkedList() {};

    public MyLinkedList(Node<T> newHead) {
        this.head = newHead;
        count = 1;
    }

    public void add(T newData) {
        Node<T> tmp = new Node(newData);
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(tmp);
    }

    public T get (int index) {
        // if (index <= 0) {
        //     return -1;
        // }
        Node<T> current = head;
        for (int i = 1; i < index; i++) {
            current.getNext();
        }
        return current.getData();
    }

    public int size() {
        return count;
    }

    public void remove() {
        Node<T> current  = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        Node<Integer> n = new Node<Integer>(1);
        MyLinkedList<Integer> ll = new MyLinkedList<Integer>(n);
        ll.add(3);
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.size());
    }
}