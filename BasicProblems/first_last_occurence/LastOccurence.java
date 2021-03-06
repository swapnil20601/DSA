package first_last_occurence;
public class LastOccurence {

    /**
     * Find Last occurence of an element in a sorted array
     * Algo: Use Binary search
     * Video: https://www.youtube.com/watch?v=OE7wUUpJw6I
     * Question: https://www.geeksforgeeks.org/find-first-and-last-positions-of-an-element-in-a-sorted-array/
     */
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

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 5, 5, 5, 7, 123, 125};
        int key = 5;
        System.out.println(getLastOccurence(arr, key));
    }
}
