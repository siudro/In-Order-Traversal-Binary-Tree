
package testbst;


import java.util.*;

public class BST {

    private Node root;


    public static class Node {

        Node left;
        Node right;
        int data;

        Node(int newData) {
            left = null;
            right = null;
            data = newData;
        }
    }

    public void BST() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return (node); // in any case, return the new pointer to the caller
    }

    public int size() {
        return (size(root));
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return (size(node.left) + 1 + size(node.right));
        }

    }

    public boolean lookup(int data) {
        return (lookup(root, data));
    }

    private boolean lookup(Node node, int data) {
        if (node == null) {
            return (false);
        }
        if (data == node.data) {
            return (true);
        } else if (data < node.data) {
            return (lookup(node.left, data));
        } else {
            return (lookup(node.right, data));
        }
    }

    public void inOrder() {
        inorderTree(root);
        System.out.println();
    }

    private void inorderTree(Node node) {
        if (node == null) {
            return;
        }
// left, node itself, right 
        inorderTree(node.left);
        System.out.print(node.data + " ");
        inorderTree(node.right);
    }

    public int root() {
        return root.data;
    }

    private Node deleteNode(Node node, int key) {
        if (node == null) {
            return node;
        }
        if (key < node.data) {
            node.left = deleteNode(node.left, key);
        } else if (key > node.data) {
            node.right = deleteNode(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.data = min(node.right);
            node.right = deleteNode(node.right, node.data);
        }
        return node;
    }

    public void deleteNode(int key) {
        deleteNode(root, key);
    }

    private int min(Node node) {
        if (node.left == null) {
            return node.data;
        }
        return min(node.left);

    }

    private int max(Node node) {
        if (node.right == null) {
            return node.data;
        }
        return max(node.right);
    }

    

}
