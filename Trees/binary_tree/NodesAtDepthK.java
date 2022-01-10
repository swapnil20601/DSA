package binary_tree;

/** For question refer : https://www.geeksforgeeks.org/print-nodes-at-k-distance-from-root/
 * 
 *          10
          /   \
        5      7
      /        / \ 
    2          8  3
   /
  9  
    When k = 2; [2, 8, 3]
    When k = 3; [9]
 * 
 */
public class NodesAtDepthK {
    public static void printArDepthK(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }

        if(k == 0){
            System.out.println(root.data);
            return;
        }

        printArDepthK(root.left, k - 1);
        printArDepthK(root.right, k - 1);
    }
}
