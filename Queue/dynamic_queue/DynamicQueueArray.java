package dynamic_queue;

import circular_queue.QueueEmptyException;

public class DynamicQueueArray {
    private int[] data;
    private int rear; // index of element at rear of the queue
    private int front; // index of element at front of the queue
    private int size;

    public DynamicQueueArray() {
        this.data = new int[5];
        this.rear = -1;
        this.front = -1;
    }

    public DynamicQueueArray(int capacity) {
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

    public void enqueue(int val) {
        if (this.size == this.data.length) {
            doubleCapacity();
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

    private void doubleCapacity() {
        int[] temp = this.data;
        this.data = new int[2*temp.length];
        int k = 0;

        /**
         * We start copying from i = fromt bcoz consider Q = [3,6,1,7]. Front = 3 & rear = 7
         * Suppoese, We do dequeue(), then Q = [0,6,1,7], front = 6 & rear = 7
         * We again do deq(). then then Q = [0,0,1,7], front = 1 & rear = 7
         * Now if we do enqueue(5). So as per our circular queue logic, Q = [5,0,1,7], front = 1 & rear = 5
         * enqueue(4). Then,  Q = [5,4,1,7], front = 1 & rear = 4
         * So you see front is not at 0th index & also rear is not at last index. 
         * Hence, while copying elemnst into new data[] we start from front & copy elments into new data[] until the end
         * of temp[].
         */
        for (int i = this.front; i < temp.length; i++) {
            this.data[k] = temp[i];
            k++;
        }

        /**
         * Then we will start from 0th index & copy element into new data[] till front-1. We use i < front instaed of
         * i <= rear bcoz lets say for Q = [4,9,1,3,8], there are not dequeue() ops, then front = 4 & rear = 8.
         * In this case i <= rear will again copy all elemnst from 4..8 into the new array. 
         * i.e = newQ = [4,9,1,3,8,4,9,1,3,8]
         * This will be duplicate copy.
         * Hence to avoid it we use  for (int i = 0; i < front; i++) instead of  for (int i = 0; i <= rear; i++)
         */
        for (int i = 0; i < this.front; i++) {
            this.data[k] = temp[i];
            k++;
        }
        
        /**
         * After this copying we have to set front & rear at the correct indexes.
         */

         this.front = 0;
         this.rear = temp.length-1;
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
