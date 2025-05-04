//How to reverse an array
import java.util.Arrays;
public class ReverseArray{
    public static int[] reverse(int arr[]){
        int n= arr.length;
        int ans[] = new int[n];
        int j=0;
        int i = n-1;
        while(i>=0){
            ans[j++] = arr[i--];
        }
        return ans;
    }
    //    //Initialize array  
    //    int [] arr = new int [] {1, 2, 3, 4, 5};  
    //    System.out.println("Original array: ");  
    //    for (int i = 0; i < arr.length; i++) {  
    //        System.out.print(arr[i] + " ");  
    //    }  
    //    System.out.println();  
    //    System.out.println("Array in reverse order: ");  
    //    //Loop through the array in reverse order  
    //    for (int i = arr.length-1; i >= 0; i--) {  
    //        System.out.print(arr[i] + " ");  

    public static void Reverse2(int arr[]){
       //by swapping
       int n=arr.length;
       int start=0,end= n-1;
       while(start <end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
       }

       for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
       }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       
       System.out.println(Arrays.toString(Problem1.reverse(arr))); 
       
        
    }
}
