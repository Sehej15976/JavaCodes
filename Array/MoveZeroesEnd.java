//how to move zeroes at end of an 
import java.util.Arrays;
public class MoveZeroesEnd {
    public void moveZeroesAtEnd(int arr[], int n){
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {8,1,0,2,1,0,3};
        System.out.println("Array Before : "+ Arrays.toString(arr));
       
        Problem23 moveZeroAtend = new Problem23();
       moveZeroAtend.moveZeroesAtEnd(arr, arr.length);
       System.out.println("Array After : "+ Arrays.toString(arr));


    }
}
