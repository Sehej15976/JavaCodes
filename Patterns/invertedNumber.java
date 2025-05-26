// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2 
// 1

import java.util.Scanner;

public class invertedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=6;i++){
            for(int j=1; j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
