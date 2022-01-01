package Queue;

public class CircularQueueArray {
    private int[] data;
    private int rear; // index of element at rear of the queue
    private int front; // index of element at front of the queue
    private int size;

    public CircularQueueArray() {
        data = new int[5];
        rear = -1;
        front = -1;
    }

    public CircularQueueArray(int capacity) {
        data = new int[capacity];
        rear = -1;
        front = -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }

        return data[front];
    }

    public int rear() {
        return rear;
    }

    public void enqueue(int val) throws QueueFullExeception {
        if (size == data.length) {
            throw new QueueFullExeception();
        }

        if (size == 0) {
            front++; // or front = 0
        }

        /*
         * This use % op to implement circular queue. In case, if rear moves out of
         * array and if there is room for an element at front, then circular queue can be used.
         * For ex, if queue contains 3 element. You delete an element at 0th index and
         * you do enqueue operation next, then it means
         * rear moves out of array but you still have room for a new element at 0th
         * index.
         */
        rear = (rear + 1) % data.length;

        data[rear] = val;
        size++;
    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }

        int temp = data[front];

         /*
         * Similar to enqueue, if front moves out of array & if there are elements in queue
         * that can be deleted then we move front back to 0. 
         */

        front = (front + 1) % data.length;
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        }

        return temp;
    }

    public void printQueue(){
        for (int val : data) {
            if(val != 0){
                System.out.print(val+" ");
            }
        }
        System.out.println();
    }
}
