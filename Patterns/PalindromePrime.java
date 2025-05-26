import java.util.Scanner;

public class PalindromePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        printPrimePalindrome(m, n);;

        sc.close();
    }

    public static boolean isPrime(int num){
        if(num <= 2){
            return false;
        }

        for(int i=2; i*i <=num;i++){
            if(num%i == 0){
             return false;
            }
        }
        return true;
       }

       public static boolean isPalindrome(int num){
        int original = num;
        int reversed = 0;
        while(num != 0){
            reversed = reversed*10 + num%10;
            num /= 10;

        }

        return original == reversed;
       }

     public static void printPrimePalindrome(int m, int n){
        for(int i=m;i<=n;i++){
            if(isPrime(i) && isPalindrome(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
     }
}
