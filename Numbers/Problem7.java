//print ASCII value in java
public class Problem7 {
    // public static void main(String[] args) {
    //     //character whose ascii value to be found
    //     char ch1 = 'a';
    //     char ch2 = 'b';
    //     //variable thats stores the integer value of the character

    //     int ascii1 =ch1;
    //     int ascii2 = ch2;

    //     System.out.println("The ASCII value of " + ch1 + " is "  + ascii1);
    //     System.out.println("The ASCII value of " + ch2 + " is "  + ascii2);
    // }


    public static void main(String[] args) {
        for(int i=0; i<=255; i++){
            System.out.println("The ascii value of "+(char)i +" = "+i);
        }
    }
}
