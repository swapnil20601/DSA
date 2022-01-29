package P_217;

import java.util.HashSet;
import java.util.Set;

/* Appraoch 2: USing HashSet
    1. Put all elements in hashset
    2. If the len(arr) & hashset are different then it means there was a duplicate item & thats y hashset didnt add it
    bcoz hashset only stores unique elements. So return false. Otherwis return true

    TC = O(N)
    SC = O(N)

*/
public class Approach2 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int item : nums) {
            set.add(item);
        }

        return set.size() != nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
