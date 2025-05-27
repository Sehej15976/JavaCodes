// //Given Two integer inputs as the numbers, the objective is to check whether the ratio of the sum of the factors of the number except the number itself upon the number, of the both numbers, matches or not. 
// Example
// Input : 6 12
// // Output : Yes, they are a friendly pair.
// Input : 6 28
// Output : Yes, they are a friendly pair
// Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
// Now the sum of factors of both the numbers are 6 and 28 respectively. 
// When we divide the sums with the numbers we get 1 and 1 respectively. 
// As the ratio of both the number match, they are considered as a friendly pair.
public class FriendlyPair {
    
    public static void main(String[] args) {
        int n1 = 30;
        int n2 = 140;
        int sum1 = getDivisorsSum(n1);
        int sum2 = getDivisorsSum(n2);

        if( sum1/ n1 == sum2/n2){
            System.out.println("Friendly pair");
        }else{
            System.out.println("Not friendly pair");
        }
    }
    public static int  getDivisorsSum(int num){
        int sum =0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum = sum + i;
            }

        }
        return sum;
    }
}
