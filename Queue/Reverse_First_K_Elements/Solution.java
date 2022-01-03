package Reverse_First_K_Elements;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static Queue<Integer> reverse(Queue<Integer> input, int k) {
        if (k == 0) {
            return input;
        }

        int temp = input.poll();
        reverse(input, k - 1);
        input.add(temp);

        return input;
    }

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        // Your code goes here
        if (input.size() <= 1 || k > input.size()) {
            return input;
        }

        Queue<Integer> ans = reverse(input, k);

        for (int i = 0; i < input.size()-k; i++) {
           ans.add(ans.poll());
        }

        return ans;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int[] arr = {3,4,2,5,6,7,8};
        int k = 7;

        for (int i : arr) {
            q.add(i);
        }
        Queue<Integer> res = reverseKElements(q, k);

        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
