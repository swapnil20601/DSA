package BST.replace_with_sum;

import binary_tree.BinaryTreeNode;

public class Solution {
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
        helper(root, 0);
	}
    
    private static int helper(BinaryTreeNode<Integer> root, int sum){
        if(root == null){
            return sum;
        }
        
        int right = helper(root.right, sum);
        root.data = root.data + right;
        sum = root.data;
        int left = helper(root.left, sum);
        return left;
    }
}
