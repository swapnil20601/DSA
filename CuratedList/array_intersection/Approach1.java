package array_intersection;

/*
Naive approach : pick 1 element in arr1 & try to search it in arr2. If you find it in arr2, then print it.
Do this for every ele in arr1. 

TC = O(N*M) where n = len(arr1) & m = Len(arr2)


Using sorting
Sort both arrays & use 2ptr on them
TC = O(n log n) + O(m + n)
SC = O(1)
*/

import java.util.Arrays;
public class Approach1 {
    public static void intersection(int[] arr1, int[] arr2) {
        // Your code goes here
        if(arr1.length == 0 || arr2.length == 0){
            return;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            }
            else{
                j++;
            }
        }
    }

}
