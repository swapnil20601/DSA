package array_intersection;

/*
Using HashMap:
 Iterate thru arr1 & put all items & their occurences in map.
 Now iterate through arr2. If map contains that element & if the occurence of that element > 0,
 then print it & reduce its occurence by 1
 
 TC & SC = O(N)

*/
import java.util.*;
public class Approach2 {
    public static void printIntersection(int[] arr1,int[] arr2){
		if(arr1.length == 0 || arr2.length == 0){
            return;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int item : arr1){
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        
        for(int ele : arr2){
            if(map.containsKey(ele) && map.get(ele) > 0){
                System.out.println(ele);
                map.put(ele, map.get(ele) - 1);
            }
        }
	}
}
