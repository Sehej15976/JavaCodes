// Example 1:
// Input: min = 10 , max = 50
// Output: 11 22 33 44 
// Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

// Use a for loop and pass every element to the palindrome function.
// Now make a palindrome function which takes an integer as a parameter.
// Reverse the given number.
// If the reversed number is equal to the given number then print it.


public class PalindromeNoinRange {

    public static int  reverse(int n){
        int reverse = 0;
        int temp = n;
        while(temp>0){
            reverse = reverse*10 + temp%10;
            temp=temp/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int min = 100;
        int max = 150;
        for(int i=min ; i<=max; i++){
            if(i == reverse(i)){
                System.out.println(i+" ");
            }
        }
    }
}