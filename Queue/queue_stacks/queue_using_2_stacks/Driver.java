package queue_stacks.queue_using_2_stacks;

public class Driver {
    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        
        int[] arr ={10,20,30,40};

        for (int i : arr) {
            q.enqueue(i);
        }

        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.front());

        System.out.println("-----------------");

        // System.out.println(q.dequeue());
        // q.dequeue();

        while(!q.isEmpty()){
            q.dequeue();
        }

        System.out.println("-----------------");

        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.front());
    }
}
