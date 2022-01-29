package P_217;

import java.util.HashMap;

/* 
Approach 3: Using HashMap

    1. Scan array and keep putting the element into HashMap if that is not present in hashmap.
    2. If it is present that straight away return true. Else continue putting them in hashmap & at end return false

    TC = O(N) -- for scanning array & putting in hashmap
    SC = O(N)
*/
public class Approach3 {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int item : nums) {
            if(map.containsKey(item)){
                return true;
            }
            map.put(item, map.getOrDefault(1, 0 + 1));
        }

        return false;
    }
}
