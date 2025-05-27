//sum of GP series
// sum = a(r^n -1)/ (r-1)
// a, first term
// r, common ratio
// n, number of terms
// Example 1:
// Input: a=1 , r=0.5 , n=3
// Output: 1.75
public class Problem12 {
    public static double sumOfGp(double a, double r, int n){
        double sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + a;
            a = a*r;
        }
        return sum;
    }

    public static void main(String[] args) {
        double a = 2.0; // First term of G.P.
    double r = 1.5; // common ratio of G.P.
    int n = 4; // Number of terms of G.P.
    System.out.println("Sum of GP Series is "+sumOfGp(a, r, n));
    }
}
