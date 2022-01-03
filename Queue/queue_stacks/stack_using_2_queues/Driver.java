package queue_stacks.stack_using_2_queues;

public class Driver {
    public static void main(String[] args) {
        StackUSing2Queues<Integer> st = new StackUSing2Queues<>();

        st.push(3);
        st.push(4);
        st.push(1);
        st.push(7);
        st.push(5);

        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
    }
}
