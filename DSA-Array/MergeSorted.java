import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7,0,0,0,0};
        int arr2[] = {2, 4, 6, 8};
        int m = 4;
        int n = arr2.length;

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        // int mergedArray[] = merge(arr1, arr2, m, n);
        // System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));

        merge2(arr1, arr2, m, n);
        System.out.println("Merged Sorted Array 1: " + Arrays.toString(arr1));
        
    }

    public static int[] merge(int arr1[], int arr2[], int m, int n){
        //declare 3rd array and 2 pointers
        int arr3[] = new int[m+n];
        int left=0;
        int right=0;
        int index=0;

        //insert elements from 2 arrays into 3rd array using left anf right pointer
        while(left < m && right < n){
            if(arr1[left] <= arr2[right]){
                arr3[index] = arr1[left];
                left++;
                index++;
            }else{
                arr3[index] = arr2[right];
                right++;
                index++;
            }
        }

        //if right pointer reaches the end
        while(left<m){
            arr3[index] = arr1[left];
            left++;
            index++;
        }

        //if left pointer reaches the end
        while(right<n){
            arr3[index] = arr2[right];
            right++;
            index++;
        }
        //sort entire arr3
        return arr3;


    }


    public static void merge2(int arr1[], int arr2[], int m, int n ){
        int i=m-1; // last index of arr1
        int j=n-1; //last index of arr2
        int index = m+n-1;//last index of merge value 

        //start merging from the end
        while( i>=0 && j>=0){
            if(arr1[i] > arr2[j]){
                arr1[index] = arr1[i];
                index--;
                i--;
            }else{
                arr1[index] = arr2[j];
                index--;
                j--;
            }
        }

        //copy remaining elements from arr2 if any
        while( j>=0){
            arr1[index] = arr2[j];
            index--;
            j--;
        }
    }


}
