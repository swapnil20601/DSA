// package BST.create_LL;

// import binary_tree.BinaryTreeNode;

// class LinkedListNode<T> { 
//     T data; 
//     LinkedListNode<T> next;

//     public LinkedListNode(T data) { 
//         this.data = data; 
//     }
// }

// class LinkedList{
//     LinkedListNode<Integer> head;
//     LinkedListNode<Integer> tail;
// }

// private static LinkedList flatten(BinaryTreeNode<Integer> root){
//     LinkedList l;
//         if(root == null){
//             l.head = null;
//             l.tail = null;
//             return l;
//         }

//         if(root.left == null && root.right == null){
//             l.head = root;
//             l.tail = root;
//         }
// }


// public class Solution {
//     public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
//         return LinkedList.flatten(root).head;
// 	}

// }