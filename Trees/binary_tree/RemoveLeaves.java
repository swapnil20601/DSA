package binary_tree;
/**
 * WAP to remove all leaf nodes from the BT & return the new root.
 * Similar leetcode problem  BUT with little difference: https://leetcode.com/problems/delete-leaves-with-a-given-value/ 
 */

public class RemoveLeaves {
    public static Node<Integer> removeLeaves(Node<Integer> root){
        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            return null;
        }

        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }
}
