package binary_tree;

// WAP to count number of leaf nodes in BT
public class LeafNodes {
    public static int numLeaves(Node<Integer> root){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        return numLeaves(root.left) + numLeaves(root.right);
    }
}
