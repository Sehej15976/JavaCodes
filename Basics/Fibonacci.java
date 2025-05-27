// // 
// //General Formula to find the Nth term of a Series 
// F0 = 0 and F1 = 1 be the seed values
// The Nth term of a Fibonacci series is given as Fn = Fn-1 + Fn-2 .
// Example, 
// Input : 5
// Fibonacci Series : 0 1 1 2 3
// Explanation:
// For 3rd term it's 2nd term + 1st term.
// For 4th term it's 3rd term + 2nd term.
// for 5th term it's 4th term + 3rd term.
public class Fibonacci {
    
    //using iteration
    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;
        int nextTerm;
        System.out.print(a + " , " + b + " , ");
        for(int i=2; i<num; i++){
            nextTerm = a+b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " , ");
        }
    }

    
}
