public class EqualString {
    
        public static boolean areAlmostEqual(String s1, String s2) {
            
                    if(s1.equals(s2)){
                        return true;
                    }
                    char ch[] = s1.toCharArray();
                    int start = 0;
                    int end = ch.length-1;
                    while(start <= end){
                        char temp = ch[end];
                        ch[end] = ch[start];
                        ch[start] = temp;
                        start++;
                        end--;
                    }
            
                    String ans = ch.toString();
                    if(ans.equals(s2)){
                        return true;
                    }else{
                        return false;
                    }
            
                    
                }
        
                public static void main(String[] args) {
                    String s1 = "bank";
                    String s2 = "kanb";
                    System.out.println(areAlmostEqual(s1,s2));
        }
}

