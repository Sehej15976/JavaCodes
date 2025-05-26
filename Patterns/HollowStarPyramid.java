import java.util.Scanner;

public class HollowStarPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || i==n || j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

    sc.close();
    }
}

// for -> row = 3
// space = 3,4,5
// j = 1,2,3,4,5
// i == n
