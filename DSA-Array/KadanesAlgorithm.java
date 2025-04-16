//Given an integer array arr, find the contiguous subarray (containing at least one number) which
// has the largest sum and returns its sum and prints the subarray.


public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum3(arr, n);
        System.out.println("The maximum subarray sum is : "+maxSum);
    }

    public static int maxSubarraySum(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j;k++){
                    sum += arr[k];
                }

                max = Math.max(max, sum);
            }
        }
        return max;
    }

//to get the sum of the current subarray we just need to add the current element(i.e. arr[j]) to the sum of the previous subarray i.e. arr[i….j-1].
// Assume previous subarray = arr[i……j-1]
// current subarray = arr[i…..j]
// Sum of arr[i….j] = (sum of arr[i….j-1]) + arr[j]
    public static int maxSubarraySum2(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){

                //add current element arr[j] to sum 
                // sum of arr[i ..... j-1]
                sum += arr[j];

                max = Math.max(max, sum);//getting maximum
            }
        }
        return max;
    }  
    
    
    // subarray with a sum less than 0 will always reduce our answer and so this type of subarray cannot be a part of the subarray with maximum sum.
    public static long maxSubarraySum3(int arr[], int n){
        long max = Long.MIN_VALUE;
        long sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];


            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }

            //considering empty subarray
            if(max < 0){
                max = 0;
            }
            
        }
        
        return max;

    }


}
