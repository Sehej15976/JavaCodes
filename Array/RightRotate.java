//rotate an array


import java.util.Arrays;

public class Problem13 {
    public static void reverse(int arr[], int start, int end){
      
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int arr[], int k){
        k = k % arr.length;
        //as 6th step will be same as 1st
        if(k<0){
            k = k + arr.length;
        }
        //part1 reverse
        reverse(arr, 0 , arr.length - k -1);
        //part2 reverse
        reverse(arr, arr.length - k, arr.length - 1);

        //all reverse
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7};
        int k = 3;
       rotate(arr, k);
       System.out.println(Arrays.toString(arr));
    }
}


//  a   b   c   d   e  | f   g   h
//  0   1   2   3   4  | 5   6   7  
//  k = 3   A.length = 8
// P1 = 0-4  [0 TO (A.length - k -1)] 
// P2 = 5-7  [(A.length - k) TO (A.length -1)]