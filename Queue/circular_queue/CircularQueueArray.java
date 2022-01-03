package circular_queue;

public class CircularQueueArray {
    private int[] data;
    private int rear; // index of element at rear of the queue
    private int front; // index of element at front of the queue
    private int size;

    public CircularQueueArray() {
        this.data = new int[5];
        this.rear = -1;
        this.front = -1;
    }

    public CircularQueueArray(int capacity) {
        this.data = new int[capacity];
        this.rear = -1;
        this.front = -1;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.front == -1;
    }

    public int front() throws QueueEmptyException {
        if (this.size == 0) {
            throw new QueueEmptyException();
        }

        return this.data[this.front];
    }

    public int rear() throws QueueEmptyException {
        if (this.size == 0) {
            throw new QueueEmptyException();
        }

        return this.data[this.rear];
    }

    public void enqueue(int val) throws QueueFullExeception {
        if (this.size == this.data.length) {
            throw new QueueFullExeception();
        }

        if (this.size == 0) {
            this.front++; // or front = 0
        }

        /*
         * This use % op to implement circular queue. In case, if rear moves out of
         * array and if there is room for an element at front, then circular queue can be used.
         * For ex, if queue contains 3 element. You delete an element at 0th index and
         * you do enqueue operation next, then it means
         * rear moves out of array but you still have room for a new element at 0th
         * index.
         */
        this.rear = (this.rear + 1) % this.data.length;

        this.data[this.rear] = val;
        this.size++;
    }

    public int dequeue() throws QueueEmptyException {
        if (this.size == 0) {
            throw new QueueEmptyException();
        }

        int temp = this.data[this.front];

         /*
         * Similar to enqueue, if front moves out of array & if there are elements in queue
         * that can be deleted then we move front back to 0. 
         */

        this.front = (this.front + 1) % this.data.length;
        this.size--;

        if (this.size == 0) {
            this.front = -1;
            this.rear = -1;
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
