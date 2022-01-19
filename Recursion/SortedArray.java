/**
 * 
 * WAP to Check if the array is sorted using recursion. 
 * For more details: https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
 * 
 *  Input : 20 21 45 89 89 90
    Output : true

    Input : 20 20 45 89 89 90
    Output : true

    Input : 20 20 78 98 99 97
    Output : false
 */

public class SortedArray {
    public static boolean isSorted(int[] arr){
        if(arr.length <= 1){
            return true;
        }

        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int start) {
        if(arr.length-1 == start){
            return true;
        }

        if(arr[start] <= arr[start+1]){
            return helper(arr, start + 1);
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 20, 78, 98, 99, 97};
        System.out.println(isSorted(arr));
    }
}
