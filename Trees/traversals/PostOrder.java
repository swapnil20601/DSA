package traversals;

import java.util.ArrayList;
import java.util.List;

import binary_tree.BinaryTreeNode;

public class PostOrder {

    //In case you want to just print
    public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
	}


    //In case if you want to return list of preorder
    
    List<Integer> postOrderList = new ArrayList<>();

    public List<Integer> postOrderList(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return postOrderList;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        postOrderList.add(root.data);

        return postOrderList;
	}
}
