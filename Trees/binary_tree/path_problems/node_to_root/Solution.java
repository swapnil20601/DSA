package binary_tree.path_problems.node_to_root;

import java.util.ArrayList;

import binary_tree.BinaryTreeNode;

public class Solution {
    static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int target){
        if(root == null){
            return list;
        }

        //if target node is found, add it to result list & return
        if(root.data == target){
            list.add(root.data);
            return list;
        }

        //call recursion on left & look for target node. Add root to the result list only if you were able to find target node & return that result list
        ArrayList<Integer> left = nodeToRootPath(root.left, target);
        if(left.size() > 0){
            left.add(root.data);
            return left;
        }

        //call recursion on right & look for target node. Add root to the result list only if you were able to find target node & return that result list
        ArrayList<Integer> right = nodeToRootPath(root.right, target);
        if(right.size() > 0){
            right.add(root.data);
            return right;
        }

        //incase you dont find the target node in tree, then just return empty list;
        return list;
    }
}
