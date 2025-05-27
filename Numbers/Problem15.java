//sum of numbers in the given range 
// Example 1:
// Input: l=2, r=7
// Output: 27
// Explanation: 2+3+4+5+6+7=27. Therefore 27 is the answer
public class Problem15 {
    public static void main(String[] args) {
        int start = 1;
        int last = 10;
        int sum = 0;
        for(int i = start; i <=last; i++){
            sum = sum + i;
        }
        System.out.print("The sum of the numbers in the given range is "+sum);
    }
}
