public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }

    public static boolean linearSearch(int arr[], int num){
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int longestSuccessiveElements(int arr[]){
        int n = arr.length;
        int longest = 1;

        //pick a element and search for its consecutive numbers
        for(int i=0; i<n; i++){
            int x = arr[i];
            int count = 1;

            for(int next = x+1; linearSearch(arr, next); next++){
                count++;
            }
            longest = Math.max(longest, count);



        }
        return longest;
    }
}
