public class MaximumProductSubarray {
    public static void main(String[] args) {
        // int nums[] = {1,2,-3,0,-4,-5};
        int nums[] = {2,3,-2,-5,6,-1,4};

		// int answer = maxProductSubArray(nums);
		int answer = maximumProductSubarray(nums);

        System.out.println(answer);
    }

    //brute force approach : T.C : O(N^3)
    public static int maxProductSubArray(int arr[]){
        int result = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int product = 1;
                for(int k=i; k<=j;k++ ){
                    product = product * arr[k];
                }
                result = Math.max(result,product);
            }
        }
         return result;
    }

    //optimal approach
    public static int maximumProductSubarray(int arr[]){
        int n = arr.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0; i<n ; i++){
            if(leftProduct == 0){
                leftProduct = 1;
            }
            if(rightProduct == 0){
                rightProduct = 1;
            }

            leftProduct = leftProduct * arr[i];
            rightProduct = rightProduct * arr[n-i-1];
            maxProduct = Math.max(maxProduct, Math.max(leftProduct, rightProduct));
        }
        return maxProduct;
    }
}
