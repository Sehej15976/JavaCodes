//Left Rotate an array
// Input: 
// arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
// Output: 3 4 5 6 7 1 2


// Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
// Output: 5 6 7 1 2 3 4

import java.util.Arrays;

public class LeftRotate2 {
    private static void leftRotate(int arr[], int n){
        System.out.println("Input Array before Rotation : ");
        System.out.println(Arrays.toString(arr));
        int temp;
        for(int i = 0; i < n; i++){
            temp = arr[0];
            for(int j=0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println("Input Array After Left Rotation By "+n+" Positions :");
          
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        leftRotate(new int[] {1,2,3,4,5,6,7}, 2);
    }
}
