package Queue;

public class QueueUse{
    public static void main(String[] args) {

        QueueArray queue = new QueueArray();
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
        
    }
}