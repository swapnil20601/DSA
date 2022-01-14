package binary_tree.path_problems.nodes_at_distance_k;

import binary_tree.BinaryTreeNode;

public class Solution {
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        if (root == null) {
            return;
        }

        if (root.data == node) {
            helper(root.left, node, k - 1);
            helper(root.right, node, k - 1);
        } else {
            nodesAtDistanceK(root.left, node, k);
            nodesAtDistanceK(root.right, node, k);
        }
    }

    private static void helper(BinaryTreeNode<Integer> root, int node, int k) {
        if (root == null) {
            return;
        }

        if (k == 0) {
            System.out.println(root.data);
        }

        helper(root.left, node, k - 1);
        helper(root.right, node, k - 1);
    }
}
