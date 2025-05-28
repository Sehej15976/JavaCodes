// Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is compared and the elements are swapped if they are not in order. This algorithm is not suitable for large data sets as its average and worst case complexity are of O(n2) where n is the number of items.

public class BubbleSort {

    public static void bubbleSort(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        bubbleSort(arr);
        System.out.println("After Sorting : ");
        printArray(arr);
    }
}