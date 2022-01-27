# Pair sum in a BST

***Similar Leet code: https://leetcode.com/problems/two-sum-iv-input-is-a-bst/***

Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S. You can use extra space of the order of O(log n).

**Note:**
1. Assume BST contains all unique elements.
2. In a pair, print the smaller element first.

**Input Format :**
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
The following line of input contains an integer, that denotes the value of S.

**Output format:**
You have to print each pair in a different line (pair elements separated by space). The order of different pairs, to be printed, does not matter.

Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
12
Sample Output 1:
2 10
5 7

IP:
10 9 -1 8 -1 7 -1 6 -1 -1 -1
13

OP:
6 7

IP:
10 9 11 8 -1 -1 12 7 -1 -1 13 -1 -1 -1 -1
21

OP:
8 13
9 12
10 11

IP:
4 2 6 1 3 5 7 -1 -1 -1 -1 -1 -1 -1 -1
15

OP:


