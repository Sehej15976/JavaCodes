//Find second smallest and second largest element in an array
// Input:
//  [1,2,4,7,7,5]
// Output:
//  Second Smallest : 2
// 	Second Largest : 5

import java.util.Arrays;

public class 2ndSmallest&Largest {
    //Brute force approach
    //this approach only works if there are no duplicates
    static private void getElements(int arr[], int n){
        if(n==0 || n==1){
            System.out.println(-1);
            System.out.println(" ");
            System.out.println(-1);
            System.out.println("\n");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n-2];
        System.out.println("Second smallest is "+small);
        System.out.println("Second largest is "+large);
    }
//better approach 
//Find the smallest and largest element in the array in a single traversal
// After this, we once again traverse the array and find an element that is just greater than the smallest element we just found.
// Similarly, we would find the largest element which is just smaller than the largest element we just found
// Indeed, this is our second smallest and second largest element

    public static void getSmallestNLargest(int arr[], int n){
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        int i;
        for(i = 0; i < n; i++){
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for(i=0; i<n; i++){
            if(arr[i] < second_small && arr[i] != small){
                second_small = arr[i];
            }

            if(arr[i] > second_large && arr[i]!= large){
                second_large = arr[i];
            }
        }
        
        System.out.println("Second smallest is "+second_small);
        System.out.println("Second largest is "+second_large);



    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,6,8,5,9};
        int n = arr.length;
        //getElements(arr, n);
        getSmallestNLargest(arr, n);
    }
}
