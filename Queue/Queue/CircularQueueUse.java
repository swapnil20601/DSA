package Queue;

public class CircularQueueUse{
    public static void main(String[] args) throws QueueEmptyException {

        CircularQueueArray queue = new CircularQueueArray();
        int[] arr = {10,20,30,40};

        for (int ele : arr) {
            try {
                queue.enqueue(ele);
            } catch (QueueEmptyException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        queue.printQueue();
        System.out.println(queue.size());

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}