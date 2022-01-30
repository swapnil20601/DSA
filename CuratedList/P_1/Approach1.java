package P_1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Naive Approach: TC = O(N^2):
 *  Pick ith element & search for its pair in j = i+1 .... n array where n = len(array) - 1.
 *  If you find pair, then return i & j
 * 
 * Approach: Using Hshtable
 * 1. If target - ele exits in hashmap, then return an array consisiting of { its index, ele's index}.
 * 2. If  target - ele DOES NOT exit in hashmap, then put in map key = ele & val = its index
 * 
 */
public class Approach1 {
    public static int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
 
       for (int i = 0; i < nums.length; i++) {
           if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]) , i};
           }
           map.put(nums[i], i);
       }
       return new int[]{0, 0};
    }
}
