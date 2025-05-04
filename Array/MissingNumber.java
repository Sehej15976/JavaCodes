//find the missing numbers in an array
// Step 1 : First we find out sum of ‘n’ numbers by using formula n*(n+1)/2.

// Step 2 : Then we will find sum of all elements of array ‘a’.

// Step 3 : Missing_Number = (Sum of 1 to ‘n’ numbers) – (Sum of elements of array ‘a’)
public class MissingNumber {
    //sum of first n elements
    public static int sumOfNUmbers(int n){
        int sum = (n * (n+1))/2;
        return sum;
    }
    //method to calculate to sum of all elements in an array
    public static int sumOfElements(int arr[]){
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 8;
        
        int[] arr = {1, 4, 5, 3, 7, 8, 6};
        int sumOfNumbers = sumOfNUmbers(n);
        int sumOfElements = sumOfElements(arr);
        int missingNumber = sumOfNumbers - sumOfElements;
        System.out.println("Missing Number is : "+missingNumber);
    }
    
}
