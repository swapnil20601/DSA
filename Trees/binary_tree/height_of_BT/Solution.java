package binary_tree.height_of_BT;

import binary_tree.Node;

public class Solution {
    public static int height(Node<Integer> root) {
		//Your code goes here
        if(root == null){
            return 0;
        }
                
        int leftHeight = height(root.left);
        int righttHeight = height(root.right);
        
        return 1 + Math.max(leftHeight, righttHeight);
	}
}
