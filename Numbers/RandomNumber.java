//how to generate random number in java
import java.lang.Math;
public class Problem6 {
    // public static void main(String[] args) {
    //     System.out.println("1st Random Number : "+Math.random());
    //     System.out.println("2nd Random Number : "+Math.random());
    //     System.out.println("3rd Random Number : "+Math.random());
    //     System.out.println("4th Random Number : "+Math.random());
    // }


    //generate random numbers between 200 to 400
    public static void main(String[] args) {
        int min=200;
        int max=400;

        System.out.println("Random value of type double between "+min+" to "+max+ ".");
        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }

}
