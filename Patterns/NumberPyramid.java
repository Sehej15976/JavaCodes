import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number pyramid");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" "+" ");
            }
            //numbers
            for(int j=1;j<=2*i-1;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}