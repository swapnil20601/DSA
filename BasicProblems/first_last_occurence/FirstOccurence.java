package first_last_occurence;
public class FirstOccurence {

    /**
     * Find First occurence of an element in a sorted array
     * Algo: Use Binary search
     * Video: https://www.youtube.com/watch?v=OE7wUUpJw6I
     * Question: https://www.geeksforgeeks.org/find-first-and-last-positions-of-an-element-in-a-sorted-array/
     */

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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int key = 8;
        System.out.println(getFirstOccurence(arr, key));
    }
}
