//find union of two arrays

import java.util.Arrays;
import java.util.HashSet;

public class Problem7 {
    static void Union(int[] ... inputArrays){
        HashSet<Integer> unionSet = new HashSet<>();
        System.out.println("Input arrays : ");
        for(int inputArray[] : inputArrays){
            System.out.println(Arrays.toString(inputArray));
            for(int i : inputArray){
                unionSet.add(i);
            }
        }
        System.out.println("Union Of All Input Arrays :");
          
        System.out.println("===========================");
          
        System.out.println(unionSet);
    }

    public static void main(String[] args) {
        int[] inputArray1 = {2, 3, 4, 7, 1};
          
        int[] inputArray2 = {4, 1, 3, 5};
          
        int[] inputArray3 = {8, 4, 6, 2, 1};
          
        int[] inputArray4 = {7, 9, 4, 1};
          
        Union(inputArray1, inputArray2, inputArray3, inputArray4); 
    }
}
