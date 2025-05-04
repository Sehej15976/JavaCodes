//rotate array by k elements : block swap
// Input: N = 5, array[] = {1,2,3,4,5} K=2
// Output: {3,4,5,1,2}


// We can use a temporary array to rotate the array left by “d” positions. This approach is useful when the array size is not too large. 

public class BlockSwap {
    public static void Rotate(int arr[], int d, int n){
        //storing rotated version in array
        int temp[] = new int[n];
        //keeping track of current index of temp[]
        int k = 0;

        //storing n-d elements of arr[] to front of temp[]

        for(int i = d; i < n; i++){
            temp[k] = arr[i];
            k++;
        }

        //storing first d elements of arr[] into temp[]

        for(int i = 0; i < d; i++){
            temp[k] = arr[i];
            k++;
        }
        // copying elements of temp[] into arr[] to get final rotated array
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }

    }

       // Function to print elements of the array
       static void PrintTheArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
       } 

       public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int d = 4;
        Rotate(arr, d, n);
        PrintTheArray(arr, n);
       }

}
