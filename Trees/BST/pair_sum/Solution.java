package BST.pair_sum;

import java.util.Stack;
import binary_tree.BinaryTreeNode;


/**
 * If you dont understand solution watch following video.
 *  https://www.youtube.com/watch?v=ssL3sHwPeb4&t=26s
 * 
 * Note: Pre-req for this problem is that you should know how to do BST iterator for inorder traversal such that
 * you get elements in sorted order. This problem invloves using this concept in sorted(ascending order) & descending order
 * 
 * 
 */
public class Solution {
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
        if(root == null){
            return;
        }

        //for traversing & creating stack for left subtree-->gives you items in sorted order after calling getElement();
        BSTIterator left = new BSTIterator(root, false);

        //for traversing & creating stack for right subtree-->gives you items in descending order after calling getElement();
        BSTIterator right = new BSTIterator(root, true);

        int l = left.getElement();
        int r = right.getElement();

        while(l < r){
            if(l + r == s){
                System.out.print(l+" "+r);
                System.out.println();
                l = left.getElement();
                r = right.getElement();
            }
            else if( l + r < s){
                l = left.getElement();
            }
            else{
                r = right.getElement();
            }
        }
	}
}

class BSTIterator{
    Stack<BinaryTreeNode<Integer>> stack = new Stack<>();

    //if isReverse = false means we are moving in leftSubtree looking for ascending order & 
    //if its true then we are moving in rightSubtree looking for descending order
    boolean isReverse = false;

    public BSTIterator(BinaryTreeNode<Integer> root, boolean isReverse){
        this.isReverse = isReverse;
        pushAll(root);
    }

    private void pushAll(BinaryTreeNode<Integer> node) {
        while(node != null){
            stack.push(node);
            if(this.isReverse == true){
                node = node.right;
            }
            else {
                node = node.left;
            }
        }
    }

    //return the smallest or largest number depending upon isReverse's value
    public int getElement(){
        BinaryTreeNode<Integer> node = stack.pop();
        if(this.isReverse == true){
            pushAll(node.left);
        }
        else{
            pushAll(node.right);
        }
        return node.data;
    }

}
