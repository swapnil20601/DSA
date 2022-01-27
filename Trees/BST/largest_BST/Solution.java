package BST.largest_BST;

import binary_tree.BinaryTreeNode;

class Pair{
    int min;
    int max;
    boolean isBST;
    int maxHeightBST;

    public Pair(int min, int max, boolean isBST, int maxHeightBST){
        this.isBST = isBST;
        this.max = max;
        this.min = min;
        this.maxHeightBST = maxHeightBST;
    }
}

public class Solution {
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
        Pair res = helper(root);
        return res.maxHeightBST;
	}

    private static Pair helper(BinaryTreeNode<Integer> root) {
        if(root == null){
            return new Pair(Integer.MAX_VALUE, Integer.MIN_VALUE, true, 0);
        }

        Pair leftOutput = helper(root.left);
        Pair rightOutput = helper(root.right);

        int minVal = Math.min(root.data, leftOutput.min);
        int maxVal = Math.max(root.data, rightOutput.max);
        boolean iscurrentBST = true;

        if(!leftOutput.isBST || !rightOutput.isBST){
            iscurrentBST = false;
        }

        if(leftOutput.max >= root.data){
            iscurrentBST = false;
        }

        if(rightOutput.min < root.data){
            iscurrentBST = false;
        }

        int currentMaxBSTHeight = Math.max(leftOutput.maxHeightBST, rightOutput.maxHeightBST);

        if(iscurrentBST){
            currentMaxBSTHeight += 1;
        }

        return new Pair(minVal, maxVal, iscurrentBST, currentMaxBSTHeight);
    }
}
