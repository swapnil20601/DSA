package binary_tree.path_sum;

import binary_tree.BinaryTreeNode;

public class Solution {
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        if(root == null){
            return;
        }

        helper(root, k, "");
	}

    public static void helper(BinaryTreeNode<Integer> root, int k, String path){
        //if this is a leaf node
        if(root == null){
            return;
        }

        if(root.left == root.right){
            if(k == root.data){
                System.out.print(path+root.data);
                System.out.println();
            }
            return;
        }

        helper(root.left, k - root.data, path + root.data +" ");
        helper(root.right, k - root.data, path + root.data +" ");
    }
}
