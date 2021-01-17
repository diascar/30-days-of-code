package bst;
import bst.Node;
public class BST {

    BST() {};

    Node insert(Node rt, int data) {
        if (rt == null) {
            Node n = new Node(data);
            return n;
        } else {
            if (data <= rt.getData()) {
                Node current = this.insert(rt.left, data);
                rt.left = current;
            } else {
                Node current = this.insert(rt.right, data);
                rt.right = current;
            }
        }
        return rt;
    }

    public int getHeight(Node root) {
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(this.getHeight(root.getLeft()), this.getHeight(root.right));
        }
    }

    public static void main(String[] args) {
        BST mybst = new BST();
        Node root = null;
        System.out.println(mybst.getHeight(root));
        root = mybst.insert(root, 2);
        System.out.println(mybst.getHeight(root));
        root = mybst.insert(root, 3);
        root = mybst.insert(root, 5);
        System.out.println(mybst.getHeight(root));
        root = mybst.insert(root, 6);
        root = mybst.insert(root, 7);
        System.out.println(mybst.getHeight(root));


    }
}