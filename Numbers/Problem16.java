//permutations in which N people can occupy R seats
// Example 1:
// Input: N = 5, r = 3
// Output: 60
// Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.
public class Problem16 {
    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }    

    public static void main(String[] args) {
        int n = 6, r = 4;
        int numerator = fact(n);
        int denominator = fact(n-r);
        int result = numerator/denominator;
        System.out.println(result);
    }

}

//2nd approach

// Intuition: n!/(n-r)! can also be written as n*(n-1)*(n-2)....(n-r+1).Using this we can calculate n!/(n-r)! in O(n) time complexity.

// Approach:

// Maintain a variable ans to store answer.
// Now run a for loop from n to (n-r+1) and multiply i to ans.
// Print ans.


// int n = 6, r = 4;
// int ans = 1;
// for (int i = n; i >= n - r + 1; i--) {
//   ans *= i;
// }
// System.out.print(ans);
