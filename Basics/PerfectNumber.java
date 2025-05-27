// Input : 6
// Output : Yes, It's a Prefect Number
// Explanation : Number = 6
// Factors of 6 except 6 are 1, 2 and 3. 
// When we add the three we get 6 itself. Therefore, it's a Perfect Number.
public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        for(int i=1 ; i<n; i++){
            if(n%i == 0){
                sum = sum + i;
                System.out.print(i + " ");
            }

        }

        if(sum == n){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not perfect number");
        }
    }
}
