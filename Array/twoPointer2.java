import java.util.Scanner;

public class twoPointer2 {


    static void SortZerosandOnes(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;

        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }

            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements ");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

       System.out.println("Original Array");
        printArray(arr);

        SortZerosandOnes(arr);
        System.out.println("Sorted Array");
        printArray(arr);

        sc.close();
        

    }
}
