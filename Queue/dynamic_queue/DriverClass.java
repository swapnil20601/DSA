package dynamic_queue;

import circular_queue.QueueEmptyException;

public class DriverClass {
    public static void main(String[] args) throws QueueEmptyException {

        DynamicQueueArray queue = new DynamicQueueArray();
        int[] arr = { 10, 20, 30, 40, 50 ,60 , 70, 80, 90, 100, 110, 120 ,130};

        for (int ele : arr) {
            queue.enqueue(ele);
        }

        queue.printQueue();
        System.out.println(queue.size());

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
