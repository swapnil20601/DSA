package frequency_of_X;
/**
 * Can be done in O(log n) time by using improved Binary search
 * 1) USing improved BS find index of first and last occurrence of key
 * 2) Return index of lastOccurence - index of firstOccurence + 1;
 */

public class Optimal {

    public static int countOccurrences(int[] arr, int key){
        int firstOccurence = getFirstOccurence(arr, key);

        if(firstOccurence != -1){
            int lastOccurence = getLastOccurence(arr, key);
            return lastOccurence - firstOccurence + 1;
        }
        

        return -1; 
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        int key = 6;
        System.out.println(countOccurrences(arr, key));

    }

    public static int getFirstOccurence(int[] arr, int key) {
        int low = 0, high = arr.length-1, res = -1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == key){
                res = mid;
                high = mid-1;
            }
            else if(arr[mid] < key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return res;
    }

    public static int getLastOccurence(int[] arr, int key) {
        int low = 0, high = arr.length-1, res = -1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == key){
                res = mid;
                low = mid+1;
            }
            else if(arr[mid] < key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return res;
    }

}
