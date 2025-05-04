//Two sum Problem : find pair  with given sum in an array
// //given an array of integers, return indices of two numbers
// nums : [2,7,11,15]
// target = 18
// 7+11 = 18
// returns 1,2

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 18;
        //int[] result = twoSum(arr, target);
        int[] result = twoSum2(arr, target);
        System.out.println("Indices are : "+Arrays.toString(result));
     

    }

    //using extra space 
    public int[] twoSum3(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int a[] = {i,j};
                    return a;
                }
            }
           
        }
         return null;
    }

    //brute force aproach
    //T.C : O(N^2)
    public static int[] twoSum(int arr[], int target){
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] == (target - arr[i])){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
        
    }

    //second aproach : using Hashmap
    public static int[] twoSum2(int arr[], int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], 1);

        }

        for(int i=0; i<arr.length; i++){
            int numToFind = target - arr[i];

            if(map.containsKey(numToFind) && map.get(numToFind) != i){
                return new int[]{i, map.get(numToFind)};
            }
        }
        return null;

}
}
