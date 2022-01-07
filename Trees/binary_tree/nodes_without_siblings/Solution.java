package binary_tree.nodes_without_siblings;

import binary_tree.Node;

public class Solution {
    public static void printNodesWithoutSibling(Node<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }

        if((root.left == null && root.right != null) || (root.left != null && root.right == null)){
            if(root.left != null){
                System.out.print(root.left.data+" ");
            }
            else {
                System.out.print(root.right.data+" ");
            }
        }

        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
	}
}
