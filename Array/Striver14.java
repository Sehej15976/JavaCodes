// Run a loop to find the start of the subarrays.
// Run another nested loop
// Multiply each element and store the maximum value of all the subarray.
public class Striver14 {
    public static int maxProductArray(int arr[]){
        int result = arr[0];
        for(int i=0; i<arr.length-1; i++){
            int p = arr[i];
            for(int j=i+1; j<arr.length;j++){
               
                p = p * arr[j];
                result = Math.max(result, p);
            }
            result = Math.max(result,p);
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,-3,0,-4,-5};
		int answer = maxProductArray(nums);
		System.out.print("The maximum product subarray is: "+answer);
    }
}
