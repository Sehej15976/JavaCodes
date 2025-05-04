// Find all the repeating elements present in an array.
// Example 1:
// Input: 
// Arr[] = [1,1,2,3,4,4,5,2]
// Output:
// //  1,2,4
// Use an array to store all repeating elements. These elements are not distinct in the array. This is because for every pair of repeating elements it will store elements in the array.
// Start iterating the array. This will pick up an element for which we want to find its duplicates.
// Iterate another nested loop for finding all pairs. Pairs which have both elements are repeating elements and store them in the array created in the initial step.
// Start iterating in the array containing repeating elements. 
// If the current element is not equal to the next element in the array then we print the current element. This is to ensure all unique repeating elements.

public class Striver12 {
    public static void findRepeatingElements(int arr[]){
        int n = arr.length;
        int count =0;
        int repeated[] = new int[n];
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    repeated[count] = arr[i];
                    count++;
                }
            }
        }
        System.out.println("The repeating elements are : ");
        // If the current element is not equal to the next element in the array then we print the current element. This is to ensure all unique repeating elements.
        for(int i=0; i<count; i++){
            if(repeated[i] != repeated[i+1]){
                System.out.print( repeated[i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,4,5,2};
		findRepeatingElements(arr);
	}
}
