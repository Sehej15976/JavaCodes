public class CountInversion {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int cnt = countInversion(arr);
        System.out.println(cnt);
    
    }

    //brute force
    public static int countInversion(int arr[]){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    //optimal approach : 
    //we recursively count the inversions in both halves. While merging the two halves back together, we also count how many elements from the left half array are greater than elements from the right half array, as these represent cross inversions (i.e., element from the left half of the array is greater than an element from the right half during the merging process in the merge sort algorithm). Finally, we sum the inversions from the left half, right half, and the cross inversions to get the total number of inversions in the array. This approach efficiently counts inversions while sorting the array.

    
}
