package BST.Bst_implementation;

import binary_tree.BinaryTreeNode;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    public int getSize() {
        return this.size;
    }

    public void insert(int val) {
        this.root = insertHelper(this.root, val);
        this.size++;
    }

    public boolean containsNode(int val) {
        return containsNodeHelper(this.root, val);
    }

    public boolean deleteNode(int val) {
        Pair ans =  removeHelper(this.root,val);
        this.root = ans.node;
        if(ans.isDeleted){
            this.size--;
        }
        return ans.isDeleted;
    }

    private Pair removeHelper(BinaryTreeNode<Integer> root, int val) {
        if(root == null){
            return new Pair(null, false);
        }

        if(root.data == val){
            //Following 2 if's takes care of both conditions; i.e; if the root is a child node Or if root has only 1 child
            //either left or right
            if(root.left == null){
                return new Pair(root.right, true);
            }
            
            if(root.right == null){
                return new Pair(root.left, true);
            }

            int inorderSuccessor = getSuccessor(root.right);
            root.data = inorderSuccessor;
            /**The above 2 lines can be written as: root.data = getSuccessor(root.right); */
            Pair rightOutput = removeHelper(root.right, root.data);
            root.right = rightOutput.node;
            return new Pair(root, rightOutput.isDeleted);
        }

        if(val < root.data){
            Pair leftOutput = removeHelper(root.left, val);
            root.left = leftOutput.node;
            return new Pair(root, leftOutput.isDeleted);
            /*instead of returning new Object you can also update the existing leftOutput obj & return it as follows:
            this will prevent creating many reduandat objects

            leftOutput.node = root
            return leftOutput
            */
        }
        else {
            Pair rightOutput = removeHelper(root.right, val);
            root.right = rightOutput.node;
            return new Pair(root, rightOutput.isDeleted);
        }
    }

    private int getSuccessor(BinaryTreeNode<Integer> root) {
        if(root.left == null && root.right == null){
            return root.data;
        }
        return getSuccessor(root.left);
    }

    public void printTree() {
        printHelper(this.root);
    }

    private static void printHelper(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + ": ");
        if (node.left != null) {
            System.out.print("L" + node.left.data + ",");
        }
        if (node.right != null) {
            System.out.print("R" + node.right.data);
        }
        System.out.println();
        printHelper(node.left);
        printHelper(node.right);
    }


    private static boolean containsNodeHelper(BinaryTreeNode<Integer> node, int val) {
        if (node == null) {
            return false;
        }

        if (node.data == val) {
            return true;
        }

        if (val < node.data) {
            return containsNodeHelper(node.left, val);
        } else {
            return containsNodeHelper(node.right, val);
        }
    }

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int val) {
        if(root == null){
            return new BinaryTreeNode<Integer>(val);
        }

        if(val < root.data){
            root.left = insertHelper(root.left, val);
        } else{
            root.right = insertHelper(root.right, val);
        }

        return root;
    }
}

class Pair{
    boolean isDeleted;
    BinaryTreeNode<Integer> node;

    public Pair(BinaryTreeNode<Integer> node, boolean isDeleted){
        this.node = node;
        this.isDeleted = isDeleted;
    }
}

/**
 * Steps for insert():
 * 1. You will need helper function which takes 2 args--> root & val. This
 * function will return root node
 * 2. If root = null, then create a new node with val & return it
 * 3. If val < root.data, then call recursion on left side. This will return new
 * root of left subtree. Just connect root.left with
 * the returned new root
 * 4. If val >= root.data, repeat step 3 on right side
 * 5. Finally return root after all connections are done
 * 
 * 
 * Steps for delete: Check DSA2 video
 */