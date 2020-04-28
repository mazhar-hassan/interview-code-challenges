package o4.challenges.code.ds.fk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelAverage {
    Node root;

    ;

    public static void main(String[] args) {
        BinaryTreeLevelAverage tree = new BinaryTreeLevelAverage();
        Node root = new Node(4);
        tree.root = root;

        root.left = new Node(7);
        root.left.left = new Node(10);
        root.left.right = new Node(2);

        root.left.right.right = new Node(6);
        root.left.right.right.left = new Node(2);

        root.right = new Node(9);
        root.right.right = new Node(6);

        List<Integer> avgs = tree.levelAverage();
        System.out.println(avgs);
        // 4, 8, 6, 6, 2

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
    private List<Integer> levelAverage() {
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int count = queue.size();
        while (!queue.isEmpty()) {
            int levelCount = count;
            int total = 0;
            while (count > 0) {
                Node node = queue.remove();
                total += node.data;
                count--;

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }
            list.add(total / levelCount);
            count = queue.size();
        }
        return list;
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
