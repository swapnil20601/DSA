package traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import binary_tree.BinaryTreeNode;

/**
 * Similar Leetcode problem: https://leetcode.com/problems/binary-tree-level-order-traversal/
 * 
 */
public class LevelOrder {
    Scanner s = new Scanner(System.in);
    Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();

    public BinaryTreeNode<Integer> constructTreeLevelWise(){
        System.out.println("Enter root: ");
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> parent = queue.poll();

            //Ask user for leftchild & attach it to parent's left & add it to queue
            System.out.println("Enter left child of "+parent.data);
            int leftChildData = s.nextInt();
            if(leftChildData != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
                parent.left = leftChild;
                queue.add(leftChild);
            }

            //Ask user for rightchild & attach it to parent's right & add it to queue
            System.out.println("Enter right child of "+parent.data);
            int rightChildData = s.nextInt();
            if(rightChildData != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
                parent.right = rightChild;
                queue.add(rightChild);
            }
        }

        return root;
    }

    
    //For printing data Level wise
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> node = queue.poll();
            System.out.print(node.data+":");

            if(node.left != null){
                System.out.print("L:"+node.left.data);
                queue.add(node.left);
            } else{
                System.out.print("L:-1");
            }

            if(node.right != null){
                System.out.print(",R:"+node.right.data);
                queue.add(node.right);
            }else{
                System.out.print(",R:-1");
            }
            
            System.out.println();
        }
	}
    
    
    //In case you want to return List of List of children. This is in Leetcode
    public List<List<Integer>> levelOrder(BinaryTreeNode<Integer> root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> list = new ArrayList<>();
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>(q.size());

            for (int i = q.size(); i > 0; i--) {
                BinaryTreeNode<Integer> node = q.poll();
                temp.add(node.data);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            list.add(temp);
        }
        
        return list;
    }

    public static void main(String[] args) {
        LevelOrder level = new  LevelOrder();
        BinaryTreeNode<Integer> n = level.constructTreeLevelWise();
        printLevelWise(n);

        // List<List<Integer>> ans = level.levelOrder(n);
        // for (int i = 0; i < ans.size(); i++) {
        //     for (int j = 0; j < ans.get(i).size(); j++) {
        //         System.out.print(ans.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }
    }
}
