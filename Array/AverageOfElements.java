//average of all elements in array
// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 3
// Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.
public class AverageOfElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        double sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + (double) arr[i];
        }
        double average = sum/n;
        System.out.println("Average of all elements in array is : "+average);
    }
}
