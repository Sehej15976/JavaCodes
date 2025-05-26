public class CrossStar {
    public static void main(String[] args) {
        int n = 7; // must be odd
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == (n / 2) + 1 || j == (n / 2) + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for alignment
                }
            }
            System.out.println(); // Move this outside the inner loop
        }
    }
}
