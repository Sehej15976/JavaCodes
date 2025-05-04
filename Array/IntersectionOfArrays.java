//find intersection of two arrays

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfArrays {

    //function to find intersection of two array

    static List<Integer> intersection(int arr1[], int arr2[]){

        //put all element of array1 in set
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }

        //traverse through arr2
        List<Integer> result = new ArrayList<>();
        for(int num : arr2){
            //if element is in set
            if(set.contains(num)){
                result.add(num);//add it to the result array
                set.remove(num); //erase from set to avoid duplicates
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        List<Integer> res = intersection(a, b);

        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
