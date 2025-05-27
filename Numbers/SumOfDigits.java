//sum of digits of a number
// Example 1:
// Input: N = 472
// Output: 13
// Explanation: The digits in the number are 4,7 and 2. Summing them up gives us a value of 13
public class Problem14 {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int digits = n%10;
            sum = sum + digits;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 472;
        int result = sumOfDigits(n);
        System.out.println("The sum of the digits of " + n + "is " + result);
    }
}
