package p_01;

import java.util.HashMap;

import java.util.Map;

/**
 * Using HashTable
 * 1) Put all eles & their freq in hashmap
 * 2) Iterate through keys of hashmap 
 * 3) Get value of each key & add that value to cum_fre
 * 4)Print key & cum_fre
 */
public class Optimized {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2};
        int cumulative_freq = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            cumulative_freq += map.get(key);
            System.out.println(key + "-->" + cumulative_freq);
        }
    }
}

/**
 * TC= O(N)
 * SC= O(N)
 */