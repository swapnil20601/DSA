package QueueLinkedList;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null; // no need to initizalize next coz by default its null
    }
}
