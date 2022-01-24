# Level wise linkedlist

Given a binary tree, write code to create a separate linked list for each level. You need to return the array which contains head of each level linked list.

**Input format :**
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.

**Output format :**
Each level linked list is printed in new line (elements are separated by space).

Sample Input 1:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1

Sample Output 1:
[5, 6, 2, 9]

Level 1 = 5 
Level 2 = 6 10 
Level 3 = 2 3 
Level 4 = 9

Sample Input 2:
1 2 3 4 5 6 -1 -1 -1 9 -1 -1 7 -1 -1 8 -1

Output:
[1, 2, 4, 9, 8]

Level 1 = 1 
Level 2 = 2 3 
Level 3 = 4 5 6
Level 4 = 9 7
Level 5 = 8
