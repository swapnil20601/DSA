## Replace Node With Depth

For a given a Binary Tree of integers, replace each of its data with the depth of the tree.
Root is at depth 0, hence the root data is updated with 0. Replicate the same further going down the in the depth of the given tree.

The modified tree will be printed in the in-order fashion.
Example:
        2
       / \
      34  4
     / \  / \
    2  4 3   6 

The above tree after updating will look like this:
        0
       / \
      1  `1
     / \  / \
    2  2 2   2 

Output: 2 1 2 0 2 1 2 (printed in the in-order fashion)


**Input Format:**
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

**Output Format:**

The first and the only line of output prints the updated tree in the in-order fashion.

**Constraints:**
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1sec

Sample Input 1:
2 35 10 2 3 5 2 -1 -1 -1 -1 -1 -1 -1 -1 
Sample Output 1:
2 1 2 0 2 1 2 

 Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
2 1 2 0 2 1 2 

IP : 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
OP: 2 1 2 3 0 1

IP: 8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
OP: 2 1 3 2 3 0 1 3 2 

IP: 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
OP: 2 1 2 0 2 1 2