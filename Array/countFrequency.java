import java.util.HashMap;
import java.util.Map;


public class countFrequency {

    public static void countFrequency(int arr[], int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i]) == false){
                map.put(arr[i],1);
            }else{
                int oldValue = map.get(arr[i]);
                int newValue = oldValue + 1;
                map.put(arr[i],newValue);
            }
        }


        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " +entry.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[] ={10,5,10,15,10,5};
        int n = arr.length;
        countFrequency(arr, n);
    }
}
