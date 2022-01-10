## Diameter Of Binary Tree

### For a given Binary of type integer, find and return the ‘Diameter’. ***Link to Leetcode problem : https://leetcode.com/problems/diameter-of-binary-tree/***


**Diameter of a Tree**
> The diameter of a tree can be defined as the maximum distance between two leaf nodes.
> Here, the distance is measured in terms of the total number of nodes present along the path of the two leaf nodes, including > both the leaves.

![tree-4777](https://user-images.githubusercontent.com/55676207/148663379-6634bcff-aa50-445e-b179-f3b592e659db.png)

The maximum distance can be seen between the leaf nodes 8 and 9. 
The distance is 9 as there are a total of nine nodes along the longest path from 8 to 9(inclusive of both). Hence the diameter according to the definition will be 9.

**Input Format:**
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

**Output Format:**
The only line of output prints an integer, representing the diameter of the tree.

Sample Input 1:
2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 8 -1 -1 9 -1 -1 -1 -1 -1 -1 
Sample Output 1:
9

Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
5

***Consider following example where noth the nodes lie on the leftsubtree. So in this case diameter is not leftsubtree's height + rightsubtree's height***

                1
               / \
              2   3
             / \    
            4   5    
           /     \    
          6       8
         /         \
        7           9   

Here the diameter is 6 . Dist between nodes 7 & 9. 
Similar is possible if both nodes lie under right subtree

**Example:**

![Diameter-of-Binary-Tree](https://user-images.githubusercontent.com/55676207/148663586-56aa23d9-5b40-4bda-92c0-de583c88b6c1.png)


