package frequency_of_X;


/**
 * Question : WAP to count the number of occurrences of given element in sorted array
 * https://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/
 */
public class BruteForce{

    public static int countOccurrences(int[] arr, int key){
        int count = 0;

        for (int i : arr) {
            if(i == key){
                count++;
            }
        }
        return count == 0 ? -1 : count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        int key = 9;
        System.out.println(countOccurrences(arr, key));
    }
}

/**
 * Algo: 
 *  1) Just keep scanning array.
 * 2) If you find key, then increment count and return it. Else return -1
 * 
 * TC=O(N)
 * 
 * Can be done in O(Log n)
 * 
 * Alternately, you can even use Collections.frequency() to find occurence of given ele
 * 
 * public static void main(String[] args) {
       List<Integer> l = new ArrayList<>();
       int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
       int x = 2;

        for (int i : arr) {
            l.add(i);
        }

        int t = Collections.frequency(l, x);
        System.err.println(t);
   }
 */