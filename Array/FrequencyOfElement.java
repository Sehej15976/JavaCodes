// //count frequency of each element in an array
// Input: arr[] = {10,5,10,15,10,5};
// Output: 10  3
// 	        5  2
//         15  1


// A boolean array visited of size n is created and initialized to false.
// This array keeps track of whether an element at a specific index has already been processed.

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static  void countFreq(int arr[], int n){
        boolean visited[] = new boolean[n];
        for(int i = 0 ; i < n ; i++){

            //skip the element already possed
            if(visited[i] == true){
                continue;
            }
            // If arr[i] == arr[j], it means we found another occurrence of arr[i].Mark visited[j] as true to avoid counting the same element again.Increment count.
            int count = 1;
            for(int j = i+1; j<n; j++){

               if(arr[i] == arr[j]){
                visited[j] = true;
                count++;
               }
            }
            System.out.println(arr[i] + " = " +count);
        }
   }

   public static void Frequency(int arr[], int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]+1));
            }else{
                map.put(arr[i], 1);
            }
        }

            // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
   }

   public static void main(String args[]){  
   
    int arr[] ={10,5,10,15,10,5};
    int n = arr.length;
    countFreq(arr, n);  
}
}
