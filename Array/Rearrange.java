//rearrrange elements in array in increasing and decreasing order
// // Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
// Input: 8 7 1 6 5 9
// Output: 1 5 6 9 8 7

// Sort the given array.
// Print the first half of the array i.e from 0 to (n/2 -1)th index,to print the first half in the ascending order.
// Then print elements from n-1 to n/2th index to get the second half in the descending order.

import java.util.Arrays;

public class Rearrange {
    public static void main(String[] args) {
        int arr[]= {8,7,6,5,1,9};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n/2; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=n-1; i>=n/2; i--){
            System.out.print
            
            (arr[i] + " ");
        }
    }
}
