package binary_tree.mirror_image;

import binary_tree.BinaryTreeNode;

public class Solution {
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        //Your code goes here
        if(root == null){
            return;
        }
		
        //if root itself is a leaf node then just return. No need to prceed further with swapping of nodes
        if(root.left == null && root.right == null){
            return;
        }
        
        //if root is not not leaf, then swap left & right subtrees
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
       
    }
}
