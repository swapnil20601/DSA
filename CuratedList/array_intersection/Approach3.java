package array_intersection;

/*
Using Binary Search:
1. Among 2 arrays, sort the array whose length is less
2. iterate over the array whose length is more & search every ele in sorted array using Binary search

Lets say we have 2 arrays, 
A1 of length n
A2 of length m

& n > m i.e len(A1) > len(A2)

 - So, sort A2. 
 - Iterate over A1 and search every element of A1 in A2 using Binary Search


TC = O(m log m) + O(n log m) --> sorting A2 takes O(m log m) + searching every ele of A1 in A2 takes O(n log m) ; 
Binary seach takes O(log m) & you are doing this for n elements in A1

SC = O(1)

Not as efficient as HAshMap but better than Sorting both arrays approach bcoz here we are sorting only the array

*/
public class Approach3 {
    //try to implement
    public static void intersections(int arr1[], int arr2[]) {
        
        
    }
}
