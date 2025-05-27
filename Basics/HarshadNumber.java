//Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.
public class HarshadNumber {
    public static void main(String[] args) {
        int n = 21;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            n=n/10;
        }

        if(n%sum == 0){
            System.out.println("Harshad number");
        }else{
            System.out.println("Not harshad number");
        }
    }
}
