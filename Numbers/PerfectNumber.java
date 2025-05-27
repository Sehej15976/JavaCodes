//check whether a number is perfect number or not
//A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself). 

// Example 1:
// Input: n=6
// Output: 6 is a perfect number
public class Problem8 {
    static boolean isPerfect(int n){
        int sum=0;
        for(int i=1; i<= n-1; i++){
            if(n%i == 0){
                sum = sum + i;
            }

       }
        if(sum == n){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
       int n = 6;
       //check if the number is perfect or not
      if(isPerfect(n)){
        System.out.println(n + " is a perfect number");
      }else {
        System.out.println(n + " is not a perfect number");
      }
    }
}
