//How to delete an element from array at specific index
//NAIVE APPROACH
//1.create an array with few elements
//2.create another array with size firstArray - 1
//3.iterate through first arrya and during iteration if you find index skip that loop
//4.copy elements of first array into another array

//import java.lang.reflect.Array;
import java.util.Arrays;

public class DeletElement {
    public static void main(String[] args) {
        int firstArray[] = {1,2,3,4,5};
        System.out.println("Original Array :" + Arrays.toString(firstArray));

        int index = 2;

        int newArray[] = new int[firstArray.length  - 1];

        for(int i=0,k=0; i<firstArray.length; i++){
            if(i==index){
                continue; //skip the part
            }
            //when the index matches the i value, continue statements skips and below statement executes
            newArray[k++] = firstArray[i];
        }

        //Alternative
        // for(int i=0, k=0;i<arr.length;i++){
        //     if(arr[i]!=j){
        //         arr_new[k]=arr[i];
        //         k++;
        //     }
        // }
        System.out.println("New Array "+Arrays.toString(newArray));

    }
}
