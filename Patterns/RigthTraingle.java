// 5
// Right triangle
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// Right triangle NUmber Inverted
// 1 2 3 4 5 
// 6 7 8 9
// 10 11 12
// 13 14
// 15
import java.util.Scanner;

public class RigthTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Right triangle ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
  
        System.out.println("Right triangle NUmber Inverted ");
        int count1 = 0;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                count1++;
                System.out.print(count1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
