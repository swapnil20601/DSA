package queue_stacks.stack_using_2_queues;
import java.util.Queue;
import java.util.LinkedList;

public class StackUSing2Queues<T> {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUSing2Queues(){
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }

    public int getSize() { 
        return this.q1.size();
    }

    public boolean isEmpty(){
        return this.getSize() == 0;
    }

    public void push(int element) {
        this.q2.add(element);

        while(!this.q1.isEmpty()){
            this.q2.add(this.q1.poll());
        }

        while(!this.q2.isEmpty()){
            this.q1.add(this.q2.poll());
        }
    }

    public int pop() {
        if(this.q1.size() == 0){
            return -1;
        }

        return this.q1.poll();
    }

    public int top() {
        if(this.q1.size() == 0){
            return -1;
        }

        return this.q1.peek();
    }
}
