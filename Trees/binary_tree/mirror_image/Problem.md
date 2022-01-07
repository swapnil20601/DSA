## Mirror Binary Tree

### For a given Binary Tree of type integer, update it with its corresponding mirror image. *Similar leetcode question: Invert binary tree https://leetcode.com/problems/invert-binary-tree/*

***Try out leetcode similar question(Medium Level): https://leetcode.com/problems/symmetric-tree/***


**Example:**
![ds](https://user-images.githubusercontent.com/55676207/148471491-9120939d-92aa-4797-b6d9-3267b4745277.png)

**Input Format:**

The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

**Output Format:**
The only line of output prints the mirrored tree in a level-wise order. 
Each level will be printed on a new line. Elements printed at each level will be separated by a single line.


Sample Input 1:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1

Sample Output 1:
1 
3 2 
7 6 5 4

Sample Input 2:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1

Sample Output 2:
5 
6 10 
3 2 
9

Input:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1

Output:
8 
10 3 
14 6 1 
13 7 4 

Input: 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1

Output: 
1 
3 2 
7 6 5 4 

Input: 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1

Output:
5 
10 6 
3 2 
9 