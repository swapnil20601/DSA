package QueueLinkedList;

import circular_queue.QueueEmptyException;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    // No need to inialize explicitly cuz by default front & rear wil be null. And
    // size will be 0
    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T val) {
        Node<T> node = new Node<T>(val);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    public T front() throws QueueEmptyException {
        if (front == null) {
            throw new QueueEmptyException();
        }
        return front.data;
    }

    public T rear() throws QueueEmptyException {
        if (front == null) {
            throw new QueueEmptyException();
        }
        return rear.data;
    }

    public T dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }

        T temp = front.data;
        front = front.next;

        /*In case if there is only 1 node & you called dequeue() to delete that 1 last node; then front = front.next will 
        become null but rear will still point to the last node. So to free the memory and allow GC to destroy it;
         we will check if front has bcome null, then make rear also null
        */
        if(front == null){
            rear = null;
        }

        size--;
        return temp;
    }
}
