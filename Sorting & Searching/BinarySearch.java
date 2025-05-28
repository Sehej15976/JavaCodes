//Binary Search is an efficient algorithm used to find the position of a target value within a sorted array. It works by repeatedly dividing the search interval in half and comparing the target value with the middle element. 
//Binary Search is a divide-and-conquer algorithm that searches for a key in a sorted array by repeatedly dividing the search interval in half until the key is found or the interval is empty.

// | Case         | Time Complexity |
// | ------------ | --------------- |
// | Best Case    | O(1)            |
// | Average Case | O(log n)        |
// | Worst Case   | O(log n)        |


public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // avoid overflow

            if (arr[mid] == key)
                return mid;  // key found
            else if (arr[mid] < key)
                low = mid + 1;  // search in right half
            else
                high = mid - 1;  // search in left half
        }

        return -1;  // key not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;
        int result = binarySearch(arr, key);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
