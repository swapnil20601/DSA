package BST.check_IS_BST;

import binary_tree.BinaryTreeNode;

/**
 * 
**OPTIMIZED SOUTION**


In naive approach we are calling recursion to find maximum key from letsubtree & minimum key from right subtree. 
Then we are checking if root > that max key from leftsubtree & root <= minimum key from right subtree. 
And again we are calling recusrion on left subtree & right subtree to check above 2 conditions. So we are making redundant recusrion calls on each & every node. 

This can be optimized by creating an object which returns all these 3 values at once,i.e, int maximum, int minimum , bolean isBST. The idea is same as that we did in checking a balanced tree & to calculate diameter.

**Steps:**
1. We create helper function which returns an object with 3 values at once.
	a. maximum key from leftsubtree,
	b. minimum key from right subtree
	c. if the leftsubtree & rightsubtree is BST or not

2. If root is null, then we return object with minimum set to Integer.MAX, maximum = Integer.MIN, isBST = true

3. Then we make recusrive calls on left & right side

4. We find the overall minimum val among leftSubtree's minimum, right subtree's minimum & root. Similarly we also find maximum val

5. Then we check for 4 isBST conditions,
	1. All the keys/elements on the left side of root should be  < root. 
	2. All the keys/elements on the right side of root should be  >= root
	3. The left subtree is a BST
	4. The right subtree is a BST

IF either of these 4 conditions fail, we set isBST = false, else we set it to true

6. Then we return the oibject with all these updated values to the isBST() function and return isBST property from that object


**Time Complexity:**
Since we are visiting each node only once & returning the obj with 3 values(min,max,boolean isBST), the time is O(N) in both balanced BST & skewed BST

 * 
 */
public class OptimizedSol1 {
    public static boolean isBST(BinaryTreeNode<Integer> root){
       return helper(root).isBST;
    }

    private static BSTObj helper(BinaryTreeNode<Integer> root){
        if(root == null){
            return new BSTObj(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }

        BSTObj leftOutput = helper(root.left);
        BSTObj rightOutput = helper(root.right);

        int minVal = Math.min(root.data, Math.min(leftOutput.minimum, rightOutput.minimum));
        int maxVal = Math.max(root.data, Math.max(leftOutput.maximum, rightOutput.maximum));
        boolean isBST = true;

        //If maximum key from leftSubtree >= root, then it means left subtree is NOT BST. Else its BST & satsisfies the condition
        if(leftOutput.maximum >= root.data){
            isBST = false;
        }

        //If minimum key from rightSubtree < root, then it means right subtree is NOT BST. Else its BST & satsisfies the condition
        if(rightOutput.minimum < root.data){
            isBST = false;
        }

        //If either of leftOut obj or RightOutput returns isBST = false, then that particular subtree is not BST.
        // Can also be written as if(!leftOutput.isBST || !rightOutput.isBST)
        if(leftOutput.isBST == false || rightOutput.isBST == false){
            isBST = false;
        }

        return new BSTObj(minVal, maxVal, isBST);
    }
}

class BSTObj{
    int minimum;
    int maximum;
    boolean isBST;

    public BSTObj(int minimum, int maximum, boolean isBST){
        this.maximum = maximum;
        this.minimum = minimum;
        this.isBST = isBST;
    }
}