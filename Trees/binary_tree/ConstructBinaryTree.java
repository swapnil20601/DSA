package binary_tree;

import java.util.Scanner;

public class ConstructBinaryTree {
    Scanner s = new Scanner(System.in);

    public void printTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data+": ");

        if(root.left != null){
            System.out.print("L"+root.left.data+", ");;
        }
        
        if(root.right != null){
            System.out.print("R"+root.right.data);
        }
        
        System.out.println();

        printTree(root.left);
        printTree(root.right);
    }

    public BinaryTreeNode<Integer> constructTree(boolean isRoot, boolean isLeft, int parentData){
        if(isRoot){
            System.out.println("Enter root data: ");
        } else {
            if(isLeft){
                System.out.println("Enter left child of "+parentData+":");
            }
            else{
                System.out.println("Enter right child of "+parentData+":");
            }
        }

        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = constructTree(false, true, root.data);
        root.right = constructTree(false, false, root.data);
        return root;
        
    }
    

    public static void main(String[] args) {
        ConstructBinaryTree tree = new ConstructBinaryTree();
        BinaryTreeNode<Integer> root = tree.constructTree(true, true, 34);
        tree.printTree(root);
    }

}
