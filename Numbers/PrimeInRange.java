import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = 0;
        System.out.println("Prime Numbers between" +a+ "and" +b+ "are :");
        for(int i = a; i <= b ; i++){
            for(int j=2 ; j<i ; j++){
                if( i%j == 0){
                   temp = temp +1;
                }
            }
            
            if(temp == 0){
                
               System.out.println(i); 
            }else{
                temp = 0;// if we dont make temp here 0, then temp will remain 1 and it will further 
            }
        }

        sc.close();


    }
}

    

