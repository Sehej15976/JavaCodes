//given an array of stock prices.At most one transaction is allowed
//try to find maximum profit
//Input : [7,1,5,3,6,4]
//output : 5;
//Buy on day 2 (price 1) an sell on day 5(price 6), profit 6-1=5
//not 7-1 , as selling price needs to larger than buying price

public class BuyAndSell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int result = getMaxProfit(arr);
        System.out.print("Maximum Profit : "+result);
    }

    public static int getMaxProfit(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = 0;

        //finding minimum element
        for(int i=0; i<arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
        }

        //to check the max profit
        if(arr[i] - min > max){
            max = arr[i] - min;
        }


        }
        return max;
    }
}
