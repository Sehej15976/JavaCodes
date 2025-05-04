//target sum : total numbers of pair whosesum is equal to given value x
public class Problem12 {
    public  int TargetSum(int arr[], int target){
        int n=arr.length;
        int count = 0 ;
        for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
            if(arr[i]+arr[j] == target){
                count++;
            }
           }
        }
       return count;
    }

    public static void main(String[] args) {
        int arr[] = {4,6,3,5,8,2,1};
        
        Problem12 pairSum = new Problem12();
       int result =  pairSum.TargetSum(arr, 7);
        System.out.println("Total numbers of Pair "+ result);
        
    }
}
