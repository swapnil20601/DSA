import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * You are given a list of integers that contains duplicates. You have to remove the duplicates & return new list
 * Ex: [1,3,2,2,3,1,6,2,5]
 * Output = [1,3,2,6,5]
 * 
 *   Approach 1: You can solve by using HashSet
 *    Approach 2: You can also solve by using HashMap
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,3,1,6,2,5};

        ArrayList<Integer> res;
        if(arr.length != 0) {
            res = removeDupsUsingHashMap(arr);
            //ArrayList<Integer> res = removeDupsUsingHashSet(arr);
        } else {
            res = new ArrayList<>();
        }

        System.out.println(res);
    }

    private static ArrayList<Integer> removeDupsUsingHashMap(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int item : arr) {
            if(!map.containsKey(item)){
                map.put(item, true);
                result.add(item);
            }
        }

        return result;
    }

    private static ArrayList<Integer> removeDupsUsingHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int item : arr) {
            set.add(item);
        }

        ArrayList<Integer> unique = new ArrayList<>(set);
        return unique;
    }
}
