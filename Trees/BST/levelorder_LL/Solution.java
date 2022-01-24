package BST.levelorder_LL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import binary_tree.BinaryTreeNode;

public class Solution {
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
        ArrayList<LinkedListNode<Integer>> res = new ArrayList<>();
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;

        //if root is null return empty list
        if(root == null){
            return res;
        }

        /*if root is not null then follow these steps. Basically its same as level order traversal. Add 1st node of tree
        & null as an indicator that this is the end of current level & after null we are moving on to next level
        */
        queue.add(root);
        queue.add(null);

        /**
         * 1. while q is not empty keep popping nodes from queue.
         * 2. If node is not null, then create LL node.
         *          - If its the first node then make head & tail both point to it & add it to the aaraylist
         *          - If its not first node then it means head it already present. So just make tail 
         *              point to this node & update tail
         *          - If there are any children of this poped node, then add them to queue as well
         * 
         * 3. If node is null, then:
         *          - reset head & tail to null
         *          - Add null to queue as an indicator that this is the end of current level & now we are moving on to next level
         *          - !IMP = Add null to queue only if Q is not empty. If you keep adding null to Q whenever you encounter NULL from Q,
         				then you will get TLE. Bcoz you will be adding null to Q & removing null from Q infinitely

         *4.  Continue this process untill queue becomes empty & at the end return arraylist
         * 
         *
         */
        while(!queue.isEmpty()){

            BinaryTreeNode<Integer> currNode = queue.poll();

            if(currNode != null){
                LinkedListNode<Integer> node = new LinkedListNode<Integer>(currNode.data);
                if(head == null){
                    head = node;
                    tail = node;
                    res.add(head);
                } else{
                    tail.next = node;
                    tail = tail.next;
                }

                if(currNode.left != null) queue.add(currNode.left);
                if(currNode.right != null) queue.add(currNode.right);
            } 
            else {
                head = null;
                tail = null;
                if(!queue.isEmpty())
                {
                    queue.add(null);
                }
            }
        }
        return res;
    }
}
