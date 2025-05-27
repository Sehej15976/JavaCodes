//palindrome numbers 

public class Problem4 {
    static int reverseNumber(int n){
        int reversed_n = 0;
        while(n>0){
            int remainder = n%10;//getting remainder
            reversed_n = reversed_n*10 + remainder;
            n=n/10;
        }
        return reversed_n;
    }

    public static void main(String[] args) {
        int n= 123454321;
        int reversedNumber = reverseNumber(n);
        System.out.println("Reverse of N : "+reversedNumber);

        if(n==reversedNumber){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not Plaindrome Number");
        }
    }
}
