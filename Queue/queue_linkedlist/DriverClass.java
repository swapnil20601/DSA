package queue_linkedlist;

import circular_queue.QueueEmptyException;

public class DriverClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        int[] arr = {10,20,30,40,50};

        for (int item : arr) {
            queue.enqueue(item);
           
        }


        System.out.println("-------------------------Before deletion------------------------------------");
        System.out.println("Queue is empty "+queue.isEmpty());
        System.out.println("Size is "+queue.size());
        try {
            System.out.println("Front is "+queue.front());
        } catch (QueueEmptyException e2) {
            e2.printStackTrace();
        }
        try {
            System.out.println("Rear is "+queue.rear());
        } catch (QueueEmptyException e1) {
            e1.printStackTrace();
        }

        while(!queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }

        System.out.println("-------------------------After deletion------------------------------------");
        System.out.println("Queue is empty "+queue.isEmpty());
        System.out.println("Size is "+queue.size());
        try {
            System.out.println("Front is "+queue.front());
        } catch (QueueEmptyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Rear is "+queue.rear());
        } catch (QueueEmptyException e) {
            e.printStackTrace();
        }
    }
}
