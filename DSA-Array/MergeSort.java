public class MergeSort {
      public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr, 0, n-1);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
      }

      public static void divide(int arr[], int start,int end){

        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr,start,mid,end);
        
      }

      public static void conquer(int arr[], int start,int mid, int end){
        int merged[] = new int[end - start + 1];
        int index1 = start; //1st array
        int index2 = mid+1; //2nd array
        int x = 0;

        while(index1 <= mid && index2 <=end){
            if(arr[index1] <= arr[index2]){
                merged[x] = arr[index1];
                x++;
                index1++;
            }else{
               merged[x] = arr[index2];
               x++;
               index2++; 
            }
        } 

        //baki ke elements copy kro vaise ke vaise
        while (index1 <= mid) {
            merged[x] = arr[index1];
            x++;
            index1++;
        }
        while(index2 <= end){
            merged[x] = arr[index2];
            x++;
            index2++;
        }

        // Copy merged elements back to the original array
        for (int i = 0; i < merged.length; i++) {
            arr[start + i] = merged[i];
        }
    }

}
