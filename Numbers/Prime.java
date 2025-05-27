//prime number program in java

import java.util.Scanner;

public class Problem2 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int temp = 0;
        for(int i=2 ; i<= input-1 ; i++ ){
            if( input%i == 0){
                temp = temp + 1;
            }
        }

        if(temp == 0){
            System.out.println(input+" is prime number");
        }else{
            System.out.println(input+" is not a prime number");
        }



        sc.close();
    }

}
