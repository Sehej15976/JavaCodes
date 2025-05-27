// //Example
// Input : 2 3
// Output : 8
public class Power {
    
    //using recursion
    public static int power(int base, int exponent){

        if(exponent == 0){
            return 1;
        }else{
            return base * power(base, exponent-1);
        }
    }

    //with help of loop
    static int power2(int base, int exponent){
        int power = 1;
        for(int i = 1; i<= exponent; i++){
            power = power * base;
        }
        return power;
    }
    // 2^3 
    // 1 iteration = 1 * 2 = 2
    // 2 iteration = 2 * 2 = 4
    // 3 iteration = 4 * 2 = 8

    public static void main(String[] args) {
        int base = 2;
        int exponent = 4;
        System.out.println(power(base, exponent));

        System.out.println(power2(base, exponent));
    }
}
