# Check if the given tree is a BST or not?

***Link to leetcode question: https://leetcode.com/problems/validate-binary-search-tree/***
A valid BST is defined as follows:

1. The left subtree of a node contains only nodes with keys less than the node's key.
2. The right subtree of a node contains only nodes with keys greater than the node's key.
3. Both the left and right subtrees must also be binary search trees.

![tree1](https://user-images.githubusercontent.com/55676207/150363766-97ea7211-5c7b-4b57-b265-4b89406c051d.jpg)

> Input: root = [2,1,3]
> Output: true

![tree2](https://user-images.githubusercontent.com/55676207/150364184-3ffd034a-6bb4-4628-ab46-c3949c29953f.jpg)

> Input: root = [5,1,4,null,null,3,6]
> Output: false
> Explanation: The root node's value is 5 but its right child's value is 4.

**Constraints:**
The number of nodes in the tree is in the range [1, 10^4].
-231 <= Node.val <= 231 - 1

***For optimized solution in BetterSol.java, check the following dry run images:***
![IMG_1025](https://user-images.githubusercontent.com/55676207/150407980-85126f20-94ec-4f24-872c-7e0ff49d7861.jpg)
![IMG_1026](https://user-images.githubusercontent.com/55676207/150408009-8bc9fc7e-75df-4bfc-80ac-7bcae9ec6c65.jpg)
![IMG_1027](https://user-images.githubusercontent.com/55676207/150407972-bb688cc0-8b56-4c0a-a29d-2531eb1f78a8.jpg)