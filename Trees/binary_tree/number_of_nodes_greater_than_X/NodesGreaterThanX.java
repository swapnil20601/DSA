package binary_tree.number_of_nodes_greater_than_X;

import binary_tree.Node;

public class NodesGreaterThanX {
    public static int countNodesGreaterThanX(Node<Integer> root, int x) {
        if(root == null){
            return 0;
        }

        int leftCount = countNodesGreaterThanX(root.left, x);
        int rightCount = countNodesGreaterThanX(root.right, x);
        
        if(root.data > x){
            return 1 + leftCount + rightCount;
        } else {
            return leftCount + rightCount;
        }
}
