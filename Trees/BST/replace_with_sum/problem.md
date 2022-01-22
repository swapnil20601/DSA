# Replace with Sum of greater nodes

Given a binary search tree, you have to replace each node's data with the sum of all nodes which are greater or equal than it. You need to include the current node's data also.
That is, if in given BST there is a node with data 5, you need to replace it with sum of its data (i.e. 5) and all nodes whose data is greater than or equal to 5.

**Note:** You don't need to return or print, just change the data of each node.

I**Input format:**
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.

**Output format:**
In the output, data of the nodes of the tree are printed in level order form. Each level of the tree is printed on a separate line.

Sample Input 1 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1

Sample Output 1 :
18 
36 10 
38 31 
25 

IP:
4 2 6 1 3 5 7 -1 -1 -1 -1 -1 -1 -1 -1

OP:
22 
27 13 
28 25 18 7 

IP:
10 9 11 8 -1 -1 12 7 -1 -1 13 -1 -1 -1 -1

OP:
46 
55 36 
63 25 
70 13 

IP:
11 -1 12 -1 13 -1 14 -1 15 -1 -1

OP:
65 
54 
42 
29 
15 

IP:
4 -1 -1

OP:
4

IP:
10 9 -1 8 -1 7 -1 6 -1 -1 -1

OP:
10 
19 
27 
34 
40 