package Concepts.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(30);
        queue.add(67);
        System.out.println(queue.size());

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
