public class Palindrome1 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("radar".toLowerCase()));
        
        System.out.println(isPalindrome("1234321".toLowerCase()));
        
        System.out.println(isPalindrome("NAamaan".toLowerCase()));
    }

    public static boolean isPalindrome(String original){
        char data[] = original.toCharArray();
        int i=0;
        int j= data.length-1;
        while(j>i){
            if(data[i] != data[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

//for(int i= length-1 to 0)
//reversed = reversed + str.charAt(i);