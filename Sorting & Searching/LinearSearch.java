// //Linear Search is the simplest searching algorithm that checks each element sequentially until a match is found. It is good for unsorted arrays and small datasets.
// Best Case Complexity: The best-case time complexity of the linear search is O(1).
// Average Case Complexity: The average case time complexity of the linear search is O(n).
// Worst-Case Complexity: The worst-case time complexity of the linear search is O(n).


public class LinearSearch {
    public static int linearSearch(int arr[], int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 7, 5};
        int x = 1;
        int index = linearSearch(arr, x);
        System.out.println("Element found at index : "+index);
    }
}
