// Selection Sort divides the array into two parts:

// 1) Sorted part (initially empty)

// 2) Unsorted part (initially the entire array)

//On each pass, it finds the smallest (or largest) element in the unsorted part and swaps it with the first element of the unsorted part.



// Case	: Time Complexity
// Best Case	O(n²)
// Average	O(n²)
// Worst Case	O(n²)
//Space Complexity: O(1) — It’s an in-place sorting algorithm.

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1;i++){
            int min = i;
            for(int j=i+1; j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int element : arr){
            System.out.print(element +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,7,6,9,8};
        System.out.println("Before Sorting : ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("After Sorting : ");
        printArray(arr);
    }
}
