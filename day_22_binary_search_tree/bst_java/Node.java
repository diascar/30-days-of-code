package bst;

public class Node {

    int data;
    Node left = null;
    Node right = null;

    Node(int data) {
        this.data = data;
    }

    void setLeft(Node n) {
        this.left = n;
    }

    void setRight(Node n) {
        this.right = n;
    }

    void setData(int d) {
        this.data = d;
    }

    int getData() {
        return this.data;
    }

    Node getLeft() {
        return this.left;
    }

    Node getRight() {
        return this.right;
    }

}