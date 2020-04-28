package o4.challenges.code.ds.tree;

import o4.challenges.code.ds.linklist.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftNodesOnly {
    int visibleNodes(BNode root) {
        // Write your code here

        List<Integer> visible = new ArrayList<>();

        int level = 1;
        while (root != null) {

            if (visible.size() < level) {
                visible.add(root.data);
            }
            if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            }
        }

        return visible.size();
    }
/*
            8  <------ root
           / \
         3    10
        / \     \
       1   6     14
          / \    /
         4   7  13
 */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(8);
        tree.add(3);
        tree.add(10);
        tree.add(1);
        tree.add(6);
        tree.add(4);
        tree.add(7);
        tree.add(14);
        tree.add(13);
        tree.add(11);
        tree.printLevelByLevel();
        collectLeftNodes(tree.root);
        System.out.println(tree.getDepth());
    }

    public static void collectLeftNodes(BNode root) {

        if (root == null) {
            System.err.println("Empty tree");
            return;
        }

        List<Integer> list = new ArrayList<>();
        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while(!queue.isEmpty()) {
            int count = queue.size();
            while (count > 0) {
                BNode node = queue.remove();
                if (list.size() < level) {
                    list.add(node.data);
                }
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                count--;
            }
            System.out.println();
            level++;
        }
        System.out.println(list);
    }

}
