public class CountInversion1 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(inversionCount(arr));
    }

    public static int countInversion(int arr[], int low, int high){
        int count = 0;

        if(low >= high){
            return count;
        }

        int mid = low + (high - low)/2;
        count += countInversion(arr,low,mid);
        count += countInversion(arr,mid+1,high);
        count += merge(arr,low,mid,high);
        
        return count;
    }

    public static int merge(int arr[], int low, int mid, int high){
        //count in two subarrays
        int n1 = mid-low+1;
        int n2 = high-mid;

        //set up two arrays for left and right halves
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1; i++)
            left[i] = arr[i + low];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];


        // Initialize inversion count (or result)
        // and merge two halves
        int res = 0;
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {

            // No increment in inversion count
            // if left[] has a smaller or equal element
            if (left[i] <= right[j])
                arr[k++] = left[i++];
          
            // If right is smaller, then it is smaller than n1-i 
            // elements because left[] is sorted
            else {
                arr[k++] = right[j++];
                res += (n1 - i);
            }
        }

        // Merge remaining elements
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];

        return res;
    }

    static int inversionCount(int[] arr) {
        return countInversion(arr, 0, arr.length - 1);
    }
   
}
