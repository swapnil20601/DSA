package BST.Bst_implementation;

public class Driver {
   public static void main(String[] args) {
    BST tree = new BST();
    tree.insert(5);
    tree.insert(2);
    tree.insert(7);
    tree.insert(1);
    tree.insert(3);
    tree.insert(6);
    tree.insert(8);

    tree.printTree();
    System.out.println();
    System.out.println("size "+tree.getSize());
    System.out.println("contains? "+tree.containsNode(5));
    System.out.println(tree.deleteNode(5));
    tree.printTree();
    System.out.println();
    System.out.println("size "+tree.getSize());
    System.out.println();
    System.out.println(tree.deleteNode(2));
    tree.printTree();
    System.out.println();
    System.out.println(tree.containsNode(2));
    System.out.println(tree.deleteNode(1));
    System.out.println();
    tree.printTree();
    System.out.println(tree.deleteNode(66));
    System.out.println();
    tree.printTree();
   }
}
