// Example 1:
// Input: N = 5
// Output: 0 1 1 2 3 5
// Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

//Naive approach  : fib(i) = fib(i-1) + fib(i-2)
public class Fibonacci1 {
    public static void main(String[] args) {
        int count = 5;
        if(count == 0){
            System.out.println(0);
        }else {
            int fib[] = new int[count+1];
            fib[0] = 0;
            fib[1] = 1;
            for(int i = 2; i<=count; i++){
                fib[i] = fib[i-1] + fib[i-2];
            }
            System.out.println("The fibonaci series upto " + count + " term : ");
            for(int i=0; i<=count; i++){
                System.out.print(fib[i] + " ");
            }

        }
    }
}
