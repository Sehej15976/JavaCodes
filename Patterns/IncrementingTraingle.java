import java.util.Scanner;

public class IncrementingTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col");
		int n = sc.nextInt();
		// int col = sc.nextInt();
        int count = 0;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print((count+(n-1)));
                
            }
            count--;
            System.out.println();
        }
        sc.close();

    }
}
