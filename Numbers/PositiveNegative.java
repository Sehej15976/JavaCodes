//check whether given number is positive or negative
//Using conditions

// public class Problem10 {
//     public static void main(String[] args) {
//         int n = 7;
//         if (n > 0) {
//             System.out.println(n + " is positive.");
//           } else {
//             System.out.println(n + " is negative.");
//           }
//     }
// }

//Using Bitwise operators
//The signed right shift operator '>>' uses the sign bit to fill the trailing positions. For example, if the number is positive then 0 will be used to fill the trailing positions and if the number is negative then 1 will be used to fill the trailing positions.

//-> Right Shift n by 31.
// If we get 0 then n is positive.
// If we get -1 then n is negative.

public class Problem10 {
    public static void main(String[] args) {
        int n = 10;
        if (n >> 31 == 0) {
            System.out.println(n + " is positive.");
          } else if (n >> 31 == -1) {
            System.out.println(n + " is negative.");
         }
    }
}