package o4.challenges.code.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    BNode root;

    public void setRoot(BNode root) {
        this.root = root;
    }

    public void add(int data) {
        add(new BNode(data));
    }

    public void add(BNode node) {
        if (root == null) {
            root = node;
        } else {
            BNode f = root;
            BNode p = null;
            while (f != null) {
                p = f;
                if (node.data < f.data) {
                    f = f.left;
                } else {
                    f = f.right;
                }
            }

            if (node.data < p.data) {
                p.left = node;
            } else {
                p.right = node;
            }
        }
    }

    private void depthFirst(BNode node) {
        if (node.left != null)
            depthFirst(node.left);

        System.out.print(node.data + ", ");

        if (node.right != null)
            depthFirst(node.right);
    }

    public int getDepth() {
        return getDepth(root);
    }
    public int getDepth(BNode node) {
        if (node == null) {
            return 0;
        }
        int left = getDepth(node.left);
        int right = getDepth(node.right);
        return Math.max(left,right) + 1;
    }

    public void printLevelByLevel() {

        if (root == null) {
            System.out.println("Empty tree");
            return;
        }

        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int count = queue.size();
            while (count > 0) {
                BNode node = queue.remove();
                System.out.print(node.data+" ");
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                count--;
            }
            System.out.println();
        }
    }

    public void print() {

        depthFirst(root);
    }
}
