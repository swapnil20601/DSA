package queue_stacks.queue_using_stacks;
import java.util.Stack;

public class OptimizedSolution {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public OptimizedSolution(){
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    
    // getSize() - Same as Solution1

    //isEmpty() - Same as Solution1

    //enqueue(int element) - Same as Solution1

    public int dequeue() {
        //Implement the pop() function
        if(stack1.empty()&& stack2.empty()){
            return -1;
        }

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int front() {
        //Implement the pop() function
        if(stack1.empty()&& stack2.empty()){
            return -1;
        }

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }
}
