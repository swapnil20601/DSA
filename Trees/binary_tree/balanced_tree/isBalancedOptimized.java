package binary_tree.balanced_tree;

import binary_tree.Node;

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


The idea of optimized soln is to create a class whose object returns both (height of subtree & if the subtree is balanced or not)
at the same time, so that we dont have to go all the way down to first find hright of subtree & right subtree & then check if its 
balanced or not & then call recusrion again on left & right subtree.
*/
public class isBalancedOptimized {

    private static BalancedTree isBalancedBetter(Node<Integer> root){
        if(root == null){
            return new BalancedTree(0, true);
        }

        BalancedTree leftOutput = isBalancedBetter(root.left);
        BalancedTree rightOutput = isBalancedBetter(root.right);
        boolean isBal = true;

        if(Math.abs(leftOutput.height - rightOutput.height) > 1){
            isBal = false;
        }

        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal = false;
        }

        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        return new BalancedTree(height, isBal);
    }

    public static boolean isBalanced(Node<Integer> root){
        BalancedTree ans = isBalancedBetter(root);
        return ans.isBalanced;
    }
}

class BalancedTree {
    int height;
    boolean isBalanced;

    public BalancedTree(int height, boolean isBalanced){
        this.height = height;
        this.isBalanced = isBalanced;
    }
}