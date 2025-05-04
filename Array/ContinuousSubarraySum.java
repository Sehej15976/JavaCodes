// //Java program to find continuous sub array whose sum is equal to a given number
// Continuous sub array of [42, 15, 12, 8, 6, 32] whose sum is 26 is
// 12 8 6
// Continuous sub array of [12, 5, 31, 13, 21, 8] whose sum is 49 is
// 5 31 13
// Continuous sub array of [15, 51, 7, 81, 5, 11, 25] whose sum is 41 is
// 5 11 25

import java.util.Arrays;

public class ContinuousSubarraySum {
    public static void findSubArray(int arr[], int target){
        

        //iterating through second element
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length ; j++){
               sum = sum + arr[j];
                if(sum == target){
                    System.out.println("Continuous sub array of "+Arrays.toString(arr)+" whose sum is "+target+" is ");
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k] + " ");
                    }
                    
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {42, 15, 12, 8, 6, 32};
        int target1 = 26;
        findSubArray(arr1, target1);
    }
}
