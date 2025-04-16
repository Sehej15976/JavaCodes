//dutch national flag problem
//
// [0 .... low-1] -> 0   extreme left
// [low.... mid-1] -> 1
// [mid .... high] -> unsorted 0 1 2
// [high+1.... n-1] -> 2  extreme right

//a[mid] == 0 swap(a[low] & a[mid]) low++ mid++
//a[mid] == 1 mid = mid+1
//a

public class Sort012{
    public static void main(String[] args) {
        int arr[] = {0,1,1,2,0,1,2,2,1,1};
        int n = arr.length;
        sortArray(arr, n);
        for(int element : arr){
            System.out.print(" "+ element);
        }
    }

    public static void swap(int arr[], int start, int end ){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void sortArray(int arr[],int n){
        int low = 0;
        int high = n-1;
        int mid = 0;
        

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
    }



}