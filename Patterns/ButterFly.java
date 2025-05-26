import java.util.Scanner;

public class ButterFly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //upperHalf of diamond
        for(int i=1; i<=n; i++){

            //print left half 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //print spaces in middle (2*(n-i))
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //print right half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //print lower half of diamond
        for(int i=n-1; i>=1; i--){

            //print left half 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //print spaces in middle (2*(n-i))
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //print right half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
