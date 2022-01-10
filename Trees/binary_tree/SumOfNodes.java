package binary_tree;

public class SumOfNodes {
    public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
        if(root == null){
            return 0;
        }
        
        
        int leftSubTreeSum = getSum(root.left);
        int rightSubTreeSum = getSum(root.right);
        
        return root.data + leftSubTreeSum + rightSubTreeSum;
        
	}
}
