package binary_tree.build_from_traversals.postorder_inorder;

import binary_tree.BinaryTreeNode;

/**
 * Approach is similar to Construct BT from inorder & preorder except that 
 * you create root starting from last element of postorder & then adjust indexes accordingly
 */

public class Solution {
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
        if(postOrder.length == 0 || inOrder.length == 0){
            return null;
        }

        return helper(postOrder,inOrder, 0, postOrder.length-1, 0, inOrder.length-1);
	}

    private static BinaryTreeNode<Integer> helper(int[] postOrder, int[] inOrder, int startPost, int endPost, int startIn, int endIn) {
        if(startIn > endIn || startPost > endPost){
            return null;
        }

        //Step 1: Find root in Inorder using Postorder & create root node
        int rootIndex = -1;
        for (int i = 0; i < inOrder.length; i++) {
            if(inOrder[i] == postOrder[endPost]){
                rootIndex = i;
                break;
            }
        }
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(postOrder[endPost]);

        //Step 2: Find inorder of both left & right subtree
        int startInLeft = startIn;
        int endInLeft = rootIndex - 1;
        int startInRight = rootIndex + 1;
        int endInRight = endIn;

        //Step 2: Find postorder of both left & right subtree
        int startPostLeft = startPost;

        //To calculate endIndex of Postorder rightsubtree, find length of inOrder's rightsubtree & make necessary calculations for correct indexes
        int lenghtOfPostOrderLeft = endInLeft - startInLeft + 1;

        int endPostLeft = startPostLeft + lenghtOfPostOrderLeft - 1;
        int startPostRight = endPostLeft + 1;
        int endPostRight = endPost - 1;

        //Step 4: Use recursion to build left & right subtrees & connect them to root
        root.left = helper(postOrder, inOrder, startPostLeft, endPostLeft, startInLeft, endInLeft);
        root.right = helper(postOrder, inOrder, startPostRight, endPostRight, startInRight, endInRight);
        
        return root;
    }
}
