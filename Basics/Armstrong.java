// //Example
// Input : 371
// Output : It's an Armstrong Number.
// Explanation: 371 = 3^3 + 7^3 + 1^3
// Therefore it's an Armstrong number.
public class Armstrong {
    //calculate the order of the number

    public static int order(int num){
        int count=0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
    public static boolean isArmstrong(int num){

        int sum  = 0;
        int n = order(num);
        int temp = num;
        //iterate through each digit of number
        while(temp != 0){
            int remainder = temp % 10;
            sum = (int) (sum + Math.pow(remainder, n));
            temp = temp/10;
        }

        if(sum == num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        //int num = 153;
        int num = 2333443;
        System.out.println(isArmstrong(num));
    }
}
