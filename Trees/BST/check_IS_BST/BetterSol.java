package BST.check_IS_BST;

import binary_tree.BinaryTreeNode;

/**
 * For undersatnding the solution, check dry run images attached in problem.md file.
 * We are basically usinf min & max range & checking if root lies betoween that range. IF not, then we directly return false
 * otherwise we update range for the next root comparison in the next recursive call
 */
public class BetterSol {
    public static boolean isBST(BinaryTreeNode<Integer> root){
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean helper(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
        if(root == null){
            return true;
        }

        if(root.data < minRange || root.data > maxRange){
            return false;
        }

        boolean isLeftInRange = helper(root.left, minRange, root.data - 1);
        boolean isRightInRange = helper(root.right, root.data, maxRange);

        return isLeftInRange && isRightInRange;
    }

    
}
