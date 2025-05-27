// Input: n = 135
// Output: Yes 
// Explanation: 1^1 + 3^2 + 5^3 = 135
// Therefore, 135 is a Disarium number
public class DissariumNumber {
    //function to count digit

    public static int countDigit(int n ){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;

    }

    public static boolean isDissariumNumber(int n){
        int temp = n;
        int count = countDigit(n);
        int sum = 0;
        while(n > 0){
            int remainder = n%10;
            sum += Math.pow(remainder, count);
            count--;
            n = n/10;
        }

        if(sum == temp){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 135;
       if(isDissariumNumber(n)){
        System.out.println("DISSARIUM NUMBER");
       }else{
        System.out.println("NOT DISSARIUM");
       }

    }
}
