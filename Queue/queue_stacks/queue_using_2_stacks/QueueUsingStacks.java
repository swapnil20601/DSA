package queue_stacks.queue_using_2_stacks;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks(){
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public int getSize() { 
        //Implement the getSize() function
        return stack1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return stack1.size() == 0;
    }

    public void enqueue(int element) {
        //Implement the push(element) function
        stack1.push(element);
    }

    public int dequeue() {
        //Implement the pop() function
        if(stack1.size() == 0){
            return -1;
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int front = stack2.peek();
        stack2.pop();

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return front;
    }

    public int front() {
        //Implement the top() function
        if(stack1.size() == 0){
            return -1;
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int front = stack2.peek();

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return front;
    }
}
