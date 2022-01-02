package circular_queue;

public class CircularQueueUse {
    public static void main(String[] args) throws QueueEmptyException, QueueFullExeception {

        CircularQueueArray queue = new CircularQueueArray();
        int[] arr = { 10, 20, 30, 40 };

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