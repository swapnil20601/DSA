# Largest BST

Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height in the given binary tree. You have to return the height of largest BST.

**Input format :**
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.

**Output format:**
The first and only line of output contains the height of the largest BST.

Sample Input 1:
10 8 20 6 9 18 24 -1 -1 -1 -1 -1 -1 22 -1
Sample Output 1:
4

Sample Input 2:
10 6 25 8 9 7 28 4 12 -1 -1 -1 -1 -1 -1 -1 5 -1 6 -1 -1
Sample Output 2:
4

Sample Input 3:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 3:
2

IP:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1

OP:
4

IP:
4 2 6 1 3 5 7 -1 -1 -1 -1 -1 -1 -1 -1

OP:
3