package binary_tree.replace_node_with_depth;

import binary_tree.Node;

public class Solution {
	
    public static void helper(Node<Integer> root, int depth){
        if(root == null){
            return;
        }
        
      	root.data = depth;
        
        helper(root.left, depth+1);
        helper(root.right, depth+1);
    }
    
	public static void changeToDepthTree(Node<Integer> root) {
	    helper(root, 0);
	}

}
