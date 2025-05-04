// //given an unsorted array find median 
// Example 1:
// Input: [2,4,1,3,5]
// Output: 3

import java.util.Arrays;

public class Median {
    public static void getMedian(int arr[], int n){
        Arrays.sort(arr);
        if(n%2==0){
            int index1 = (n/2)-1;
            int index2 = (n/2);
            System.out.println((double)(arr[index1]+arr[index2])/2);

        }else{
            System.out.println(arr[(n/2)]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 2, 5, 6};
	int n = 6;
	System.out.print("The median of the array is: ");
	getMedian(arr, n);
    }
}
