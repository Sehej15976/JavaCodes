import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

public class LeadersinArray {
    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
        int n = arr.length;
        ArrayList<Integer> ans = printLeaders2(arr, n);
        // Collections.sort(ans,Collections.reverseOrder());
        Collections.reverse(ans);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }

    public static ArrayList<Integer> printLeaders2(int arr[], int n){

    ArrayList<Integer> ans = new ArrayList<>();

    //last element of an array is always leader
    int max = arr[n-1];
    ans.add(arr[n-1]);

    //start cheking from the end whether a number is greater than max no. from right, hence leader

    for(int i=0; i<n; i++){
        if(arr[i] > max){
            ans.add(arr[i]);
            max = arr[i];
        }
    }
    return ans;

    }
}