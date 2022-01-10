package binary_tree.diameter_tree;

import binary_tree.BinaryTreeNode;

/**
 * This is O(N*N) time soln. Becoz we are calling height() repeatedly after
 * finding left diameter & right diameter.
 * Then we find the maximum of left dia, right dia & (left height + right
 * height) becoz maximum diamter could be on left side OR
 * right side OR one node on left & other on right. We dont exactly know. Hence
 * we find max of all 3.
 * 
 * Somehow we need to optimize thos soln by not calling height() again & again.
 * 
 * Video link in case unclear about soln and apporach:
 * https://www.youtube.com/watch?v=rrXAISjtbAA
 */
public class Naive {
    private static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null) {
            return 0;
        }

        // If one leaf node lie on leftsubtree & other on right subtree & has maximum
        // distance between them
        int leftRightDiameter = height(root.left) + height(root.right);

        // If the 2 leaf nodes with maximum distance lie on the left subtree.
        int leftDiameter = diameterOfBinaryTree(root.left);

        // If the 2 leaf nodes with maximum distance lie on the right subtree.
        int rightDiameter = diameterOfBinaryTree(root.right);

        // The diamter will the maximum of all the above 3
        int diameter = Math.max(leftRightDiameter, Math.max(rightDiameter, leftDiameter));

        return diameter;
    }
}
