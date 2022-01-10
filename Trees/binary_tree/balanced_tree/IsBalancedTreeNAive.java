package binary_tree.balanced_tree;

import binary_tree.BinaryTreeNode;
import binary_tree.height_of_BT.Solution;

/*WAP to check if the tree is balanced?
A tree is said to be balanced if height of left subtree - height of right subtree <= 1.
Similar leetocde problem: https://leetcode.com/problems/balanced-binary-tree/

Eg: Check balanceness for following tree. Output = false
                1
               / \
              2   3
             /     \
            4       5
           /         \
          6           7
*/
public class IsBalancedTreeNAive {
    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        /*if root itself is null, then it means tree is balanced */
        if(root == null){
            return true;
        }

        /**
         * Then we find height of left subtree & right subtree of root node.
         * Check if its balanced?
         * If it is not balanced then directly return false.
         * But if it is balanced then only we check for balanceness of the leftsubtrees's root node
         * & right sub tree's root node.
         */
        int leftHeight = Solution.height(root.left);
        int rightHeight = Solution.height(root.right);

        if(Math.abs(leftHeight-rightHeight) > 1){
            return false;
        } 

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }
}
