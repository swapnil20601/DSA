package binary_tree.diameter_tree;

import binary_tree.Node;

/**
 * We can optimize the naive soln by creating the class whose object we give us both height & diamter of both left &
 * right subtrees. In this way we will visit each one only once & get diameter & height in that visit itself.
 * 
 * So th TC will be O(N). To understand optimized soln: see implementation here :https://www.youtube.com/watch?v=fuPqnDs1HMw
 */
public class Optimized {

    private static DiaPair diameterHeight(Node<Integer> root){
        if(root == null){
            return new DiaPair(0, 0);
        }

        DiaPair leftOutput = diameterHeight(root.left);
        DiaPair rightOutput = diameterHeight(root.right);
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        int leftRightDiameter = leftOutput.height + rightOutput.height;
        int leftDiameter = leftOutput.diamater;
        int rightDiameter = rightOutput.diamater;

        int diameter = Math.max(leftRightDiameter, Math.max(leftDiameter, rightDiameter));

        return new DiaPair(height, diameter);
    }    

    public static int diameterOfBinaryTree(Node<Integer> root){
        return diameterHeight(root).diamater;
    }
}

class DiaPair {
    int height;
    int diamater;

    public DiaPair(int height, int diameter){
        this.diamater = diameter;
        this.height = height;
    }
}