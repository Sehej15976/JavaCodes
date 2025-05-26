import java.util.Scanner;

public class Systenic2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            
            // Print first half alphabets
            for (char ch = 'A'; ch <= 'E' - i; ch++) {
                System.out.print(ch);
            }
            
            // Print second half alphabets
            for (char ch = (char) ('E' - i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            
            System.out.println();
        }
        sc.close();
    }
}


//ABCDE
// ABCD
//  ABC
//   AB
//    A