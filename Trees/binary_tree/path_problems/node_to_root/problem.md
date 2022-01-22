# Find Node To Root Path in Binary Tree

You are given a partially written BinaryTree class. You are given an element. You need to return a path from that node to root in form of list.

**Ex:**
            50
           /   \
          25    75
         /  \  /  \
        12  37 62  57
            /    \
           30     70

**OutPut:** [70, 62, 75, 50]


**Steps:**
1. If root itself is null, then just return empty list

2. If you are able to find the target node, then just add it to the result list & return the list

3. If step 1 & 2 are not met, then call recursion on ***left & right side*** looking for the target node.

4. If the result list has atleast 1 element that means you were able to find the taget node. So while returning just add the root node to result list and return the list. If result list is empty that dont do anything.