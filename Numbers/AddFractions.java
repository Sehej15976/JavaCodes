//program to add two fractions 
// Example 1:
// Input: 3/4 + 1/7 
// Output: 25/28
// Explanation: Since 3/4 + 1/7 = 25/28

// The denominator will be lcm of den1 and den2.Then change the num1 and num2 as we changed den1 and den2 to lcm and then add the new num1 and num2 to get the new numerator.

//1. First find gcd of den1 and den2 using euclidean’s algorithm.Once we get the gcd we can easily find lcm.lcm(den1,den2) is (den1*den2)/gcd(den1,den2).
//2.  Now we will have to change num1 and num2 to num1*(den3/den1) and num2*(den3/den2),since we changed den1 and den2 to lcm.
//3.  Now add num1 and num2 and store it in the num3.

//4.  Now we have num3 and den3.The answer should be num3/den3,but before printing the answer we should convert it into the simplest form.
//5.  To convert it into the simplest form,divide numerator and denominator both by gcd of numerator and denominator.
// Print num3 / den3.
public class Problem17 {
    //function to return gcd of a and b
    public static int gcd(int a,int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
        
    }
    //function to convert obtained fraction in simplest form 
    public static void lowest(int den3, int num3){
        //finding gcd of both terms
        int common_factor = gcd(num3,den3);

        //converting both terms into simplest form by dividng them by common factor

        den3 = den3/common_factor;
        num3 = num3/common_factor;
        System.out.println(num3+"/"+den3);
    }

    public static void addFraction(int num1, int den1, int num2, int den2){
        //finding gcd of den1 and den2
        int den3 = gcd(den1,den2);
        den3 = (den1*den2) /den3;

        int num3 = (num1)* (den3/den1) + (num2)*(den3/den2);
        lowest(den3, num3);

    }

    public static void main(String[] args) 
    {        
    int num1=1, den1=500, num2=2, den2=1500; 
    System.out.print(num1+"/"+den1+" + "+num2+"/"+den2+" is equal to ");
    addFraction(num1, den1, num2, den2);
    } 
}
