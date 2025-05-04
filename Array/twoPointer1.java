//sort an array consisting of only 0s and 2s
public class twoPointer1 {


    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void SortZerosandOnes(int arr[]){
        int n = arr.length;
        int zeroes = 0;
        //count number of zeros
        for(int i = 0; i<n ; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }
        //0 to zeroes-1 : 0 and zeroes to n-1 : 1
        for(int i = 0 ; i < n ; i++){
           if(i < zeroes){
            arr[i] = 0 ;
           }else {
            arr[i] = 1;
           }
        }
    }

    public static void main(String[] args) {
        
    }
}
