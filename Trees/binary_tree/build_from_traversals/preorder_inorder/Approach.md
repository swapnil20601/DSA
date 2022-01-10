**Steps:**
> 1. Find the root
> 2. Find inorder of both left & right subtree
> 3. Find preorder of both left & right subtree
> 4. Use recursion to build left & right subtrees
> 5. Connect root with both

## Example:

**Inorder**: 4 2 5 1 6 3 7
**Preorder**: 1 2 4 5 3 6 7

***Step 1:***
1. We know that preorder = root, leftsubtree, rightsubtree & inorder = left subtree, root, roght subtree. So its easy to find root using **preorder** coz 1st node itself is root. Hence root = 1

***Step 2:***
1. Now that we root = 1, then in inorder all the nodes to the left of 1 will make leftsubtree & all to the right of 1 will make right subtree. So leftSubtree = [4,2,5] & rightSubtree = [6,3,7]

***Step 3:***
We know 1st node is root, i.e; Root = 1. From inorder we know that [4,2,5] = left subtree. Its length = 3. 
To find out leftsubtree in preorder, we will count 3 nodes after root bcoz we know that length of leftsbutree = 3 from Step 2.
And everything after the leftsubtree will be right subtree. Hence, in **preorder**, leftSubtree = [2,4,5] & rightSubtree = [3,6,7]

***Step 4 & Step 5 are pretty intuitive***
Call recusrion of leftsubtree & right subtree & just connect root.left = leftSutree, root.right = rightSubtree. At the end, just return root