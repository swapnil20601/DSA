package binary_tree.path_problems.gfg_node_to_root;

import java.util.ArrayList;

import binary_tree.BinaryTreeNode;

/**
 * For question refer: https://www.geeksforgeeks.org/print-path-root-given-node-binary-tree/
 * Its similar to node_to_root problem. The only difference is that here we return list in ascending order &
 * in node_to_root we return in descending order 
 */
public class Solution {
    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int target){
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null){
            return arr;
        }
        getPath(root, target, arr);
        return arr;
    }

    private static boolean getPath(BinaryTreeNode<Integer> root, int target, ArrayList<Integer> arr) {
        if(root == null){
            return false;
        }

        arr.add(root.data);

        if(root.data == target){
            return true;
        }

        boolean leftSubtree = getPath(root.left, target, arr);
        boolean rightSubtree = getPath(root.right, target, arr);
        
        if(leftSubtree || rightSubtree){
            return true;
        }

        arr.remove(arr.size()-1);
        return false;
    }
}
