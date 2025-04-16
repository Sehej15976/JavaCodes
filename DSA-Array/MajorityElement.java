//Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.
//Moore’s Voting Algorithm:
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("Majority element : "+ans);
    }
    //Brute Force Approach
    public static int majorityElement(int arr[]){
        int n = arr.length;
        int count;
        for(int i=0; i<n; i++){
            count = 0;
            for(int j=0;j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > (n/2)){
                return arr[i];
            }
        }
        return -1;
    }
}
