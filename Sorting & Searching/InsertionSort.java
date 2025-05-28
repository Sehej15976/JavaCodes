//Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. It is like sorting playing cards in your hands. You split the cards into two groups: the sorted cards and the unsorted cards. Then, you pick a card from the unsorted group and put it in the right place in the sorted group.

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i-1; //sorted part
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j]; //shifting larger element to temp by 1 position
                j = j-1;
            }
            arr[j+1] = temp; 
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
        insertionSort(arr);
        System.out.println("After Sorting : ");
        printArray(arr);
    }
}
