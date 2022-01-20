package BST.construct_bst;

import binary_tree.BinaryTreeNode;

public class Solution {
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        if(arr.length == 0){
            return null;
        }

		return helper(arr, 0, n-1);
    }

    private static BinaryTreeNode<Integer> helper(int[] arr, int start, int end) {
        if(start > end){
            return null;
        }


        int mid = (start+end) / 2;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);

        root.left = helper(arr, start, mid-1);
        root.right = helper(arr, mid+1, end);
        return root;
    }
}
