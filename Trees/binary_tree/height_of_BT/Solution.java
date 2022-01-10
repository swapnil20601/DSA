package binary_tree.height_of_BT;

import binary_tree.BinaryTreeNode;

public class Solution {
    public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return 0;
        }
                
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
	}
}
