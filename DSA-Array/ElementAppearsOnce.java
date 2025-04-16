//


public class ElementAppearsOnce {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement2(arr);
        System.out.println("The single element is: " + ans);
     }

// Time Complexity: O(N)+O(N)+O(N), where N = size of the array
// Reason: One O(N) is for finding the maximum, the second one is to hash the elements and the third one is to search the single element in the array.
    public static int getSingleElement(int arr[]){
        int n = arr.length;

        //find the maximum element
        int maximum = arr[0];
        for(int i=0; i<n;i++){
            maximum = Math.max(maximum, arr[i]);
        }

        //declare hash array of size max+1 and hash the given array
        int hash[] = new int[maximum+1];
        for(int i=0; i<n; i++){
            hash[arr[i]]++;
        }

        for(int i=0; i<n; i++){
            if(hash[arr[i]] == 1){
                return arr[i];
            }
        }
        return -1;
    }

// XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
// XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2
//     //Assume the given array is: [4,1,2,1,2]
// XOR of all elements = 4^1^2^1^2
// = 4 ^ (1^1) ^ (2^2)
// = 4 ^ 0 ^ 0 = 4^0 = 4
    public static int getSingleElement2(int arr[]){
        int n = arr.length;
        // xor of all elements
        int xorr = 0;
        for(int i=0 ; i<n; i++){
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

}
