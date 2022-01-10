package binary_tree.replace_node_with_depth;

import binary_tree.BinaryTreeNode;

public class Solution {
	
    public static void helper(BinaryTreeNode<Integer> root, int depth){
        if(root == null){
            return;
        }
        
      	root.data = depth;
        
        helper(root.left, depth+1);
        helper(root.right, depth+1);
    }
    
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    helper(root, 0);
	}

}
