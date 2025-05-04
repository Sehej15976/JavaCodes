//How to remove element from array using java collections

//creae an array and initialize with string elements
//convert array into collection(arraylist)
//remove() method in collection to remove element at specified index

import java.util.Arrays;
import java.util.*;

public class Problem10{
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,4,5,6,6};
        ArrayList<Integer> arr_new = new ArrayList<>();
        int j=3;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=j){
                arr_new.add(arr[i]);
            }
        }

        System.out.println("Before deletion : "+ Arrays.toString(arr));
        System.out.println("After deletion : "+arr_new);
    }
}