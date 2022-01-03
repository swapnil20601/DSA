package Reverse_Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        if(input.size() <= 1){
            return;
        }
        
        int temp = input.poll();
        
        reverseQueue(input);
        
        input.add(temp);
	}

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int[] arr = {2,8,5,1,10,5,9};
        for (int i : arr) {
            q.add(i);
        }

        reverseQueue(q);

        for (int i : q) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
