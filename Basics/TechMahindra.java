import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class TechMahindra {
    public static void main(String[] args) {
        int num = 275698;
        evennOdd(num);
        //System.out.println(Integer.parseInt(result));

    }

    public static void evennOdd(int num){
        String number = Integer.toString(num);
        char arr[] = number.toCharArray();
        
        int len = arr.length;
       
        List<Character> even = new ArrayList<>();
        List<Character> odd = new ArrayList<>();
        
        for(int i=0; i<len; i++){
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
            
        }
        int k =0;
        //placing even in list1
        for(int i=0; i<even.size();i++){
            arr[k] = even.get(i);
            k++;
        }
        //placing odd in list2
        for(int i=0; i<odd.size();i++){
            arr[k] = odd.get(i);
            k++;
        }
        System.out.println(arr);
       
    }
}
