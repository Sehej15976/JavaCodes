// //Example
// Input : 10
// Output : 1, 2, 5
public class Factor {
    public static void main(String[] args) {
        int num = 10;
        factors(num);
    }
    //using range for loop
    // T.C = O(n) 
    public static void factors(int num){
        for(int i=1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
