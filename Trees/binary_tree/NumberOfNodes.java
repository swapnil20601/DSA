package binary_tree;

public class NumberOfNodes {

    public int countNodes(Node<Integer> root) {
        if(root == null){
            return 0;
        }
        
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return 1 + leftNodes + rightNodes;
    }

}
