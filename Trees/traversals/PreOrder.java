package traversals;

import java.util.ArrayList;
import java.util.List;

import binary_tree.BinaryTreeNode;

public class PreOrder {

    //In case you want to just print
    public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
	}

    //In case if you want to return list of preorder

    List<Integer> preOrderList = new ArrayList<>();

    public List<Integer> preOrderList(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return preOrderList;
        }
        
        preOrderList.add(root.data);
        preOrder(root.left);
        preOrder(root.right);

        return preOrderList;
	}

}
