//reverse digits of number 
// Example 1:
// Input: N = 472
// Output: 274
// Explanation: Reading the number from back to front, we see that the output should be 274
public class Problem13 {
    public static int reverseNo(int n){
        int reverse = 0;
        while(n>0){
            reverse = reverse*10 + n%10;
            n=n/10;
        }
        return reverse ;
    }

    public static void main(String[] args) {
        int n = 472;
        System.out.print("The reverse of the given number is: "+reverseNo(n));
    }
}
