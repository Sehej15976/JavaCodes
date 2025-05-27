//Method 1 (Using Recursion) :
// Create a function fib(int n),
// Inside that function define the base condition, which is if(n<=1) return n,
// Otherwise return fib(n-1)+fib(n-2).
public class Factorial {
    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.print(fib(n));
    }
}
//{
// int a = 0, b = 1, c;
// if (n == 0)
//   return a;
// for (int i = 2; i <= n; i++) {
//   c = a + b;
//   a = b;
//   b = c;
// }
// return b;