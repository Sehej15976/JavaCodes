//remove duplicates from an sorted array

public class Striver11 {
    public static int removeDuplicates(int arr[]){
            int n = arr.length;
          if(n == 0){
            return 0;
          }
          int uniqueIndex = 0;
          for(int i=1; i<n; i++){
            if(arr[i] != arr[uniqueIndex]){
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
          }
          return uniqueIndex+1;
          //Length of the array with unique elements
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(array);

        System.out.println("Array after removing duplicates: " );
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
// Use a uniqueIndex to keep track of the position of the last unique element.
// Traverse the array, and whenever a new unique element is found (i.e., array[i] != array[uniqueIndex]), move it to the next position in the array.

