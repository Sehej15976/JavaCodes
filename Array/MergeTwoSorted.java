import java.util.Arrays;

public class MergeTwoSorted {
    public static void main(String[] args) {
        // int arr1[] = {1,2,5,6,7};
        // int arr2[] = {2,5,8,9,10};
        int arr1[] = { 1, 2, 4, 6, 7};
        int arr2[] = { 3, 5, 8};
        int answ[] = mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(answ));
    }

    public static int[] mergeSortedArrays(int arr1[], int arr2[]){
        int l1 = arr1.length;
        int l2 = arr2.length;

        int result[] = new int[l1+l2];
        int i=0;
        int j=0; 
        int k=0;

        while(i < l1 && j<l2){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                k++;
                i++;
            }else{
                result[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(i<l1){
            result[k] = arr1[i];
            k++;
            i++;
        }
        while(j<l2){
            result[k] = arr2[j];
            k++;
            j++;
        }

        return result;
    }
}
