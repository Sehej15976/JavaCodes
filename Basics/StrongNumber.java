
// Input : 145
// Output : Yes, it's a strong number
// Explanation : Number = 145
// 145 = 1! + 4! + 5!
// 145 = 1 + 24 + 120
// output number  = 145. 
public class StrongNumber {

    public static void main(String[] args) {
        int n = 145;
        if(detectStrong(n)){
            System.out.println("Strong number");
        }else{
            System.out.println("not strong number");
        }
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        // 5 
        // 1 * 1 = 1
        // 1 * 2 = 2
        // 2 * 3 = 6
        // 6 * 4 = 24
        // 24 * 5 = 120
        return fact;
    }

    public static boolean detectStrong(int n){
        int digit;
        int sum = 0;
        int temp = n;
        boolean flag = false;

        //calculate 1!+4!+5! = 145
        while (temp != 0) {
            digit = temp % 10; //145 % 10 = 5 14%10=4 1%10 = 1
            sum = sum + factorial(digit);  // 5!=120 , 120+4!= 144,  144+1! = 145
            temp = temp/10; // 14 
        }

        //returns 1 if both equal else 0
        if(sum == n){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
}
    

