/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbst;

/**
 *
 * @author KHELLO
 */
public class TestBST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BST T = new BST();
        T.insert(5);
        T.insert(3);
        T.insert(9);
        T.insert(1);
        T.insert(4);
        T.insert(6);
        System.out.println("The root of Bi-Tree is: " + (T.root()));
        System.out.println("The size of Bi-Tree is:  "+(T.size()));
        System.out.println("In-order traversal sequence :");
        T.inOrder();
        System.out.println("Pre-order traversal sequence :");
        T.preOrder();
        System.out.println("Post-order traversal sequence :");
        T.postOrder();
        System.out.println("Level-order traversal sequence :");
        T.levelOrder();
        System.out.println("In-order traversal sequence (after mirroring) :");
        T.mirror();
        T.inOrder();

    }

}
