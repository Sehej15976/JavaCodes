//find triplets with sum (3sum)
public class TripletSum {
    static boolean find3numbers(int arr[], int sum){

        int n= arr.length;
        for(int i = 0; i < n -2; i++){
            for(int j=i+1; j < n - 1; j++){
                for(int k = j+1; k < n; k++){
                    if (arr[i] + arr[j] + arr[k] == sum) {

                        // Triplet is found; print the
                        // triplet elements
                        System.out.println(
                            "Triplet is " + arr[i] + ", "
                            + arr[j] + ", " + arr[k]);
                        return true;
                    }
                }
            }
        }
    // If no triplet is found, return false
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,45,6,10,8};
        int sum  = 55;
        find3numbers(arr, sum);
    }
    
}
