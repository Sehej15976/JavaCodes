// //find second smallest and second largest element in an array
// Second Smallest Algo:

// If the current element is smaller than ‘small’, then we update second_small and small variables
// Else if the current element is smaller than ‘second_small’ then we update the variable ‘second_small’
// Once we traverse the entire array, we would find the second smallest element in the variable second_small.
// Here’s a quick demonstration of the same.
// Second Largest Algo:

// If the current element is larger than ‘large’ then update second_large and large variables
// Else if the current element is larger than ‘second_large’ then we update the variable second_large.
// Once we traverse the entire array, we would find the second largest element in the variable second_large.
public class Striver3 {
    public static int secondSmallest(int arr[], int n){
        if(n < 2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for(i=0; i < n; i++){
            if(arr[i] < small){
                second_small = small;
                small = arr[i];
            }else if(arr[i] < second_small && arr[i] != small){
                second_small = arr[i];
            }
        }
        return second_small;
    }
    public static int secondLargest(int arr[], int n){
        if(n < 2){
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i ;
        for(i = 0; i<n; i++){
            if (arr[i] > large){
                second_large = large;
                large = arr[i];
            }
            else if(arr[i] > second_large && arr[i]!= large){
                second_large = arr[i];
            }
        }
        return second_large;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
	int n = arr.length;
		int sS = secondSmallest(arr, n);
		int sL = secondLargest(arr, n);
	System.out.println("Second smallest is "+sS);
	System.out.println("Second largest is "+sL);
    }
}
