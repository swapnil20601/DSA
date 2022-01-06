package binary_tree;

//WAP to find the maximum/largest node in the BT
public class LargestNode {
    public static int findLargestNode(Node<Integer> root){
        if(root == null){
            return -1;
        }

        int largestLeft= findLargestNode(root.left);
        int largestRight= findLargestNode(root.right);
        int maxNode = Math.max(Math.max(largestLeft, largestRight),root.data);
        return maxNode;
    }
}
