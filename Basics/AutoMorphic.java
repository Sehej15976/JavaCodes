// //Automorphic Number
// A Number that when squared ends with the number itself is known as the Automorphic Number. Let's try and understand the concept of Automorphic Number,
// Example
// Input : 5
// Output : 25
// Explanation : Number = 5
// when squared you get 25
// as 25 ends with 5


// 376 = (376)2 = 141376

// 890625 = (890625)2 = 793212890625
public class AutoMorphic {
    public static void main(String[] args) {
        int x = 5;
        int y = x*x;
        if(y%10 == x%10){
            System.out.println("AutoMorphic");
        }else{
            System.out.println("Not automorphic");
        }
    }
    // public static int isAutoMorphic(int n){
    //     int square = n*n;
    //     while(n!=0){

    //     }
    // }
}

