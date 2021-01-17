package linkedList;

import java.util.Scanner;

public class LinkedList {

    public static Scanner scan = new Scanner(System.in);

    LinkedList() {};

    public void display(Node head) {
        Node current = head;
        // Node cannot be converted to boolean
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.getNext();
        }
    }


    public Node insert(Node head, int data) {
        Node tmpNode = new Node(data);
        if (head == null) {
            head = tmpNode;
            return head;
        } else if (head.getNext() == null) {
            head.setNext(tmpNode);
            return head;
        } else {
            this.insert(head.next, data);
            return head;
        }
    }

    public static void main(String[] args){
        LinkedList myList = new LinkedList();

        Node head = null;

        int T = 4;

        for (int i = 0; i < T; i++) {
            int data = scan.nextInt();
            head = myList.insert(head, data);
            
        }
        myList.display(head);
    }
}
