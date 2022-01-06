package traversals;

import java.util.ArrayList;
import java.util.List;

import binary_tree.Node;

public class InOrder {

    // In case you want to just print
    public static void inOrder(Node<Integer> root) {
        // Your code goes here
        if (root == null) {
            return;
        }

        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data + " ");
    }


    // In case if you want to return list of preorder

    List<Integer> inorderList = new ArrayList<>();

    public List<Integer> inorderTraversal(Node<Integer> root) {
        if (root == null) {
            return inorderList;
        }

        inorderTraversal(root.left);
        inorderList.add(root.data);
        inorderTraversal(root.right);

        return inorderList;
    }
}
