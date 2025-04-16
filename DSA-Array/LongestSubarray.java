import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,9};
        int K = 10;
        System.out.println(getLongestSubarray(arr, K));
    }

    public static int getLongestSubarray(int arr[], int K){
        int n = arr.length;
        int length = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }

                if(sum == K){
                    length  = Math.max(length, j-i+1);
                }
            }

          
        }
        return length;
    }

    public static int longestSubarray(int arr[], int k){
        //hashmap to store prefix sums
        Map<Integer,Integer> prefixSum = new HashMap<>();
        int result = 0;
        int currSum = 0;

        for(int i=0; i<arr.length;i++){

            //add current element to sum so far
            currSum += arr[i];

            
        }
    }
}
