package queue_stacks.stack_using_1_queue;

public class Driver {
    public static void main(String[] args) {
        StackUsingQueue<Integer> stk = new StackUsingQueue<>();
        stk.push(3);
        stk.push(2);
        stk.push(4);
        stk.push(1);
        System.out.println(stk.top());
        stk.pop();
        stk.pop();
        System.out.println(stk.top());
    }
    
}
