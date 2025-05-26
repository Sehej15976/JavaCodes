import java.util.Scanner;

public class StarDiamond {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Star Diamond");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" "+" ");
            }
            //numbers
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            //spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" "+" ");
            }
            //numbers
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}