//_ _ _ # _ _ _
//_ _ # # # _ _
//_ # # # # # _
//# # # # # # #
// in ith row, 2^i -1 stars are printed

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for star pyramid");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
           for(int j=1;j<=n-i;j++)//spaces
           {
            System.out.print(" "+" ");
           }
           for(int j=1;j<=2*i-1;j++)//stars
           {
            System.out.print("*"+" ");
           }
           
           
         System.out.println();
         }
        sc.close();
    }
}
// 2ND APPROACH
// for (int i=0; i<n; i++) 
// { 
//     for (int j=n-i; j>1; j--) 
//         System.out.print(" "); 
//     for (int j=0; j<=i; j++ ) 
//         System.out.print(" *"); 
//     System.out.println(); 
// } 