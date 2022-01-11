package binary_tree.minimum_maximum_pair;

import binary_tree.BinaryTreeNode;

/** Representation of the Pair Class */

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

public class Solution {

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null) {
            return new Pair<Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Pair<Integer, Integer> leftPair = getMinAndMax(root.left);
        Pair<Integer, Integer> rightPair = getMinAndMax(root.right);

        if (root.data < leftPair.minimum) {
            leftPair.minimum = root.data;
        }

        if (root.data > leftPair.maximum) {
            leftPair.maximum = root.data;
        }

        if (root.data < rightPair.minimum) {
            rightPair.minimum = root.data;
        }

        if (root.data > rightPair.maximum) {
            rightPair.maximum = root.data;
        }

        int minimum = Math.min(root.data, Math.min(leftPair.minimum, rightPair.minimum));
        int maximum = Math.max(root.data, Math.max(leftPair.maximum, rightPair.maximum));

        return new Pair<Integer, Integer>(minimum, maximum);
    }

}
