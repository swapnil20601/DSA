package binary_tree.build_from_traversals.preorder_inorder;

import binary_tree.BinaryTreeNode;

/**
 * 
 */
public class Solution {
    public static BinaryTreeNode<Integer> helper(int[] preOrder, int[] inOrder, int startPre, int endPre, int startIn, int endIn){
        if(startIn > endIn || startPre > endPre){
            return null;
        }

        //Step 1: Find root in Inorder using Preorder & create root node
        int rootDataIndex = -1;
        for (int i = 0; i < inOrder.length; i++) {
            if (inOrder[i] == preOrder[startPre]) {
                rootDataIndex = i;
                break;
            }
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[startPre]);

        //Step 2: Find inorder of both left & right subtree
        int startInLeft = startIn;
        int endInLeft = rootDataIndex - 1;
        int startInRight = rootDataIndex + 1;
        int endInRight = endIn;

        //Step 2: Find preorder of both left & right subtree
        int startPreLeft = startPre + 1;

        //To calculate endIndex of preorder leftsubtree, find length of inOrder's leftsubtree & make necessary calculations for correct indexes
        int lenghtOfInorderLeft = endInLeft - startInLeft + 1;

        int endPreLeft = startPreLeft + lenghtOfInorderLeft - 1;
        int startPreRight = endPreLeft + 1;
        int endPreRight = endPre;

        //Step 4: Use recursion to build left & right subtrees & connect them to root
        root.left = helper(preOrder, inOrder, startPreLeft, endPreLeft, startInLeft, endInLeft);
        root.right = helper(preOrder, inOrder, startPreRight, endPreRight, startInRight, endInRight);

        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
        if(preOrder.length == 0 || inOrder.length == 0){
            return null;
        }
        return helper(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
	}
}
