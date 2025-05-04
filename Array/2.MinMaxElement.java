//how to find min and max  element in array 
//import java.util.Arrays;
public class MinMaxElement {
    
        public static int minimum(int arr[], int n){
            int mini = Integer.MAX_VALUE;
            for(int i=0; i< n; i++){
                if(arr[i] < mini){
                    mini = arr[i];
                }
            }
            return mini;
        }

        public static int maximum(int arr[], int n){
            int max = Integer.MIN_VALUE;
            
            for(int i=0; i< n; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }

        public static void main(String[] args) {
            int arr[] = {4,8,9,5,8,88,1123,76,8999};
            int n=arr.length;
            System.out.println("Minimum Element : "+ minimum(arr,n));
            System.out.println("Maximum Element : "+ maximum(arr,n));

        }

}
