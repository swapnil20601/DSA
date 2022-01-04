package queue_stacks.queue_using_stacks;

public class Driver {
    public static void main(String[] args) {
        Solution1 q = new Solution1();
        
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
