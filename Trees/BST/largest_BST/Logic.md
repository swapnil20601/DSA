# Naive:

1. Check if root node is BST?
2. If yes, then find its height & return
3. Otherwise,recurively call on left side & right side of root to find BST with max height & return maximum of them.

if(isBST(root)){
    return heoght(root)
}
else {
    left = largestBST(root.left)
    right = largestBST(root.right)
    return Max(left, right);
}

> Here we are checkimg if root is BST or not & then calculating height. Otherwise we are going to left & right, finding BST on left & right. Then returning max of both heoight.

TC = O(n * H) in worst case when its a skewed tree. If 1st node is BST, you will calculate height by going n-1. Then you go on 2nd node & lets say thats also BST, then you will again find height for n-2. You are finding height again & again

# Better Approach:

USing Pair class. Pair class will return:
    1. Minimum among root & leftSubtree's largest node
    2. Maximum among root & right Subtree's smallest node
    3. If the root's left & right subtree is BST?
    4. max height of BST uptil now

The approach is similar to checking if tree is BST or not.

The only additional thing we have to verify is; if both leftSubtree & right Subtree are BST, then only the 
    maxHEight of BST = 1 + Max(leftsubtree height + rightSubtree height)

    Else, it will be maxHEight of BST = Max(leftsubtree height + rightSubtree height)