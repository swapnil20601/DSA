package queue_stacks.stack_using_1_queue;
import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue<T> {
    Queue<Integer> queue;

    StackUsingQueue(){
        this.queue = new LinkedList<>();
    }

    public int getSize() { 
        return this.queue.size();
    }

    public boolean isEmpty(){
        return this.getSize() == 0;
    }

    public void push(int element) {
        this.queue.add(element);
        
        for (int i = 0; i < this.getSize() - 1; i++) {
            this.queue.add(this.queue.poll());
        }
    }

    public int pop() {
        if(this.queue.size() == 0){
            return -1;
        }

        return this.queue.poll();
    }

    public int top() {
        if(this.queue.size() == 0){
            return -1;
        }

        return this.queue.peek();
    }
}
