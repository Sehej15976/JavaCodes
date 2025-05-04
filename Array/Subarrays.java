//Write a Java program which prints all contiguous sub arrays with given sum?

import java.util.Arrays;

public class Subarrays {
    public static void findAllSubarrays(int arr[], int target){
        boolean found = false;
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Given Sum: " + target);
        System.out.println("Contiguous Sub Arrays With Sum " + target + " Are:");

        //iterating through each element to start subarray
        for(int i=0 ; i<arr.length; i++){
            int sum = 0;
            for( int j=i;j<arr.length; j++){
                sum = sum + arr[j];
                // Check if the current sum equals the target
                if(sum == target){
                    System.out.print("[ ");
                    // Print the subarray from index i to j
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println("]");

                    found = true;

                }
            
            }
        }
        if (!found) {
            System.out.println("No subarrays with sum " + target + " found.");
        }

    }
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 2, 8, 3, 3, 2, -4, 12};
        int target1 = 8;
        findAllSubarrays(arr1, target1);

    }
}
