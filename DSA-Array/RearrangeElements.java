// public //Input:
// arr[] = {1,2,-4,-5}, N = 4
// Output:
// 1 -4 2 -5 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeElements {

    public static void main(String[] args) {
        // int arr[] = {1,2,-4,-5};
        // int n = 4;
        // int ans[] = rearrangebySign(arr, n);
        // System.out.println(Arrays.toString(ans));

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,-3,-4,5,-3));
        ArrayList<Integer> ans = rearrangeBySign(a);
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i) + " ");
        }
    }

    public static int[] rearrangebySign(int arr[], int n){

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(arr[i] >0){
                positive.add(arr[i]);

            }else{
                negative.add(arr[i]);
            }
        }

        //positive on even indices and negative on odd
        for(int i=0; i<n/2; i++){
            arr[2*i] = positive.get(i);
            arr[2*i+1] = negative.get(i);
        }
        return arr;


    }

    public static ArrayList<Integer> rearrangeBySign(ArrayList<Integer> list){
        int n = list.size();

        //define ans array for storing ans seprately
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        //positive elements start from 0 and negative elements start from 1
        int posIndex = 0;
        int negIndex = 1;
        for(int i=0; i<n; i++){

            //fill negative indices in odd positions and inc by 2
            if(list.get(i) < 0){
                ans.set(negIndex, list.get(i));
                negIndex += 2;
            }else{
                ans.set(posIndex, list.get(i));
                posIndex += 2;
            }
        }

        return ans;
    }
}

