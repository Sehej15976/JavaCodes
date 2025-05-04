// //Rigth rotation of an array
// Input  : arr[] = {1, 2, 3, 4, 5} 
//          D = 2
// Output : 4 5 1 2 3 
// Input arr[] = [1, 2, 3, 4, 5], D = 2
// 1) Store the first d elements in a temp array
//    temp[] = [1, 2, 3]
// 2) Shift rest of the arr[]
//    arr[] = [4, 5]
// 3) Store back the D elements
//    arr[] = [4, 5, 1, 2, 3]

public class Striver8 {
    //brute force approach
    public static void rightRotate(int arr[], int k, int n){
        while(k>0){
            //copying last element in temp variable
            int temp = arr[n-1];
            int j;
            //copying previous element in next index
            for( j=n-1; j>0;j--){
                arr[j] = arr[j-1];
            }
            //copying last element to first position
            arr[j] = temp;
            k--;
        }
    }
    //2nd approach 
    public static void rotateByK(int arr[], int k, int n){
        //if k value is greater than n, so we have to rotate array by k%n time 
        k = k%n;

        reverse(0,n-k-1,arr);
        reverse(n-k,n-1,arr);
        reverse(0,n-1,arr);
        
    }

    public static void reverse(int start,int end,int arr[]){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int k = 4;
       // rightRotate(arr, k, n);

       rotateByK(arr, k, n);
        printArray(arr, n);
    }
}
