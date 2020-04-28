package o4.challenges.code.ds;

import o4.challenges.code.ds.tree.BNode;
import o4.challenges.code.ds.tree.BinaryTree;

public class BinaryTreeTest {

/*
        4
     /     \
    7       9
  /  \       \
10    2       6
       \
        6
       /
      2

 */


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BNode root = new BNode(4);
        tree.setRoot(root);

        root.left = new BNode(7);
        root.left.left = new BNode(10);
        root.left.right = new BNode(2);

        root.left.right.right = new BNode(6);
        root.left.right.right.left = new BNode(2);

        root.right = new BNode(9);
        root.right.right = new BNode(6);

        tree.print();

    }


}
