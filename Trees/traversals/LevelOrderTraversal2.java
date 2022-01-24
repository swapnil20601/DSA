package traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import binary_tree.BinaryTreeNode;

/**
 * This is leetcode problem. 
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 * 
 * There are 3 approaches that you can use to solve this problem
 * 1) By using stack
 * 2) By using Collections.reverse
 * 3) By adding each level at 0th index of resukt list
 * 
 * For video of 3 approaches: https://www.youtube.com/watch?v=sH9YAbIpLGQ
 */
public class LevelOrderTraversal2 {

    /** Approach 1 --> By using stack */
    public static List<List<Integer>> Approach1(BinaryTreeNode<Integer> root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<BinaryTreeNode <Integer>> q = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();

        q.add(root);

        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();

            for (int i = q.size(); i > 0; i--) {
                BinaryTreeNode <Integer> node = q.poll();
                temp.add(node.data);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            
            stack.add(temp);
        }

        while(!stack.isEmpty()){
            result.add(stack.pop());
        }

        return result;
    }

    /** Approach 2 --> adding each level at 0th index of result list */
    public static List<List<Integer>> Approach2(BinaryTreeNode<Integer> root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<BinaryTreeNode <Integer>> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();

            for (int i = q.size(); i > 0; i--) {
                BinaryTreeNode <Integer> node = q.poll();
                temp.add(node.data);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            
            result.add(0, temp);
        }

        return result;
    }

    /** Approach -3 is similar to approach 2. The only difference is:
     * instead of adding temp list at 0th index every time, we add it normally one after another & then reverse the result
     * And then just it.
     * 
     * instead of result.add(0, temp) it wil be result.add(temp)
     * 
     * Then come out of while loop & reverse result as follows :
     * 
     *          Collections.reverse(result);
     *          return result;
     *          
     */
}
