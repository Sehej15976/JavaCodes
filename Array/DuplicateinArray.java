//print duplicate elements of an array

// import java.util.HashSet;

public class DuplicateinArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,5,7,8,8};
        System.out.println("Duplicate elements in given array : ");
        for(int i = 0; i < arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }

    // public static void findDuplicateUsingHashSet(int arr){
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int element : arr){
    //         if(! set.add(element)){
    //             System.out.println("Duplicate Element : "+element);
    //         }
    //     }
    // }
}
