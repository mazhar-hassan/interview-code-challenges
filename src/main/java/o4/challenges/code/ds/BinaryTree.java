package o4.challenges.code.ds;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    };

    Node root;

    public Node addNode(int data) {
        Node node = new Node(data);

        if (root == null) {
            root = node;
        }

        return node;
    }

    public void print() {

        depthFirst( root );
    }

    private void depthFirst(Node node) {
        if (node.left != null)
            depthFirst(node.left);

        System.out.print(node.data + ", ");

        if (node.right != null)
            depthFirst(node.right);


    }
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
        Node root = tree.addNode(4);

        root.left = new Node(7);
        root.left.left = new Node(10);
        root.left.right = new Node(2);

        root.left.right.right = new Node(6);
        root.left.right.right.left = new Node(2);

        root.right = new Node (9);
        root.right.right = new Node (6);

        tree.print();

    }


}
