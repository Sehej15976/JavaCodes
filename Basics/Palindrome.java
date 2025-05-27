//Given an integer input as the number, the objective is to check whether or not the given number is a palindrome. To do so, we’ll first reverse the string input using loops and recursion and check if it matches the original number.

// Example
// Input : 121
// Output : Palindrome
public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int reverse = 0;
        int remainder = 0;
        int temp = remainder;

        while(temp != 0){
            reverse = reverse + remainder% 10;
            temp = temp/10;
        }
        //palindrome f num and reverse are equal
        if(num == reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome ");
        }

    }
}