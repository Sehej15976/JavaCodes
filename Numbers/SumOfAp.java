//find sum of AP series 
// a = first term of A.P.

// d= common Difference of A.P.

// n= Number of Terms in  A.P.
// n=4
// a=2
// d=2
// Output: 20
// Explanation: 2+4+6+8 = 20
//sn = n/2(2a + (n-1)d)
public class Problem11 {
    static float sumofAP(float a,float d, int n){

        float sum = 0;
        for(int i=0; i<n;i++){
            sum = sum + a;
            a = a+d;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=20;
        float a = 2.5f;
        float d= 1.5f;
        System.out.println(sumofAP(a, d, n));
    }
}
