package BST.check_IS_BST;

import binary_tree.BinaryTreeNode;

/**
 * For a tree to be BST, following conditions should be met:
 *  1. All the keys/elements on the left side of root should be  < root
 *  2. All the keys/elements on the right side of root should be  >= root
 *  3. The left subtree should be a BST (Basically the 1st 2 pts shud be true for left subtree)
 *  4. The right subtree should be a BST(Basically the 1st 2 pts shud be true for right subtree)
 * 
 * 
 *  Steps:
 * 1. If root is null then effectively it is a BST (Base case)
 * 2. Then we try to check for the 1st condition above. For this we can say, that if we find the maximum key on the left subtree,
 *  & if that maximum key < root, then 1st condition is met & is valid. Otherwies its invalid & we can straigh away return false.
 * Hence we create a separate fucntion which returns the maximum key from left subtree
 * 
 * 3. Similarly we will find minimum key from right subtree by checking for 2nd condition above. For this we can say, that if we find the minimum key on the right subtree,
 *  & if that minimum key >= root, then 2nd condition is met & is valid. Otherwise we can straigh away return false.
 * Just like maximum fucntion, for this we create a separate fucntion which returns the minimum key from right subtree
 * 
 * 4. If both the above cases are valid, or in other words, if we don't return false from either of the above 2 conditions, that means
 *    the 1st 2 conditions of a valid BST are satisfied & now we need to check for 3rd & 4th conditions. That is we need to check
 *     if both the left subtree & right subtree are BST or not
 * 
 *  5. If both the recursive call returns true, the the given tree is valid BST. If either of them returns false, then its not a BST
 * 
 *   Time Complexity:
 * 
 *  In case of balanced BST, the time will be O(n log n) ---> T(n) = 2T(n/2) + n 
 *      You are calling getMaxKey() & getMinKey() on each & every node. Hence it takes O(n).
 *      Then you call isBST() on left subtree & right subtree. So it take n/2 + n/2 time.
 *  
 *  In case of skewed BST, time is O(n * n) ---> T(n) = T(n-1) + n
 *      Here if its left skewed tree, then we call only getMaxKey() & if its right skewed, then we call only getMinKey().
 *      We call this on every node. So it takes O(n) time. Similarly, we call isBST() on every node. Hence it takes O(n) time.
 *      So total time is O(n*n)
 * 
 *  Just like Check if the Binary tree is balanced problem,  we are making calling recursion to get maximum node from left subtree,
 *  minimum node from right subtree. Checking if the root node satisfies valid BST condition. And then again making same recursive calls
 *  on left subtree & right subtree & again doing same thing. Hence it is not optimized as you are making recursive calls again & again
 * 
 */


public class Naive {
    
    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }

        int leftMax = getMaxKey(root.left);

        if(leftMax >= root.data){
            return false;
        }

        int rightMax = getMinKey(root.right);

        if(rightMax < root.data){
            return false;
        }

        return isBST(root.left) && isBST(root.right);
    }

    private static int getMinKey(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MAX_VALUE;
        }

        int leftSubtree = getMinKey(root.left);
        int rightSubtree = getMinKey(root.right);

        return Math.min(root.data, Math.min(leftSubtree, rightSubtree));
    }

    private static int getMaxKey(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int leftSubtree = getMaxKey(root.left);
        int rightSubtree = getMaxKey(root.right);

        return Math.max(root.data, Math.max(leftSubtree, rightSubtree));
    }
}
