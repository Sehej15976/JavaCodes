//find maximun difffernece between two array elements
//{10,20,2,90,40}
//find maximum and smallest and take their difference 
// 90 - 2 = 88

import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
    int n, max , min;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements : ");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements of array    :");
    for(int i=0; i<n; i++){
        a[i] = sc.nextInt();
    }
    //initializing max and min with 0
    max = a[0];
    min = a[0];
    for(int i =0 ; i < n ;i++){
        if(a[i]>max){
            max = a[i];
        }
    }

    for(int i =0 ; i < n ;i++){
        if(a[i]<min){
            min = a[i];
        }
    }
    System.out.println("Maximum Elements : "+max);
    System.out.println("Minimum Elements: "+min);
    System.out.println("Maximum Difference between elements : "+(max-min));

    sc.close();
    }
}
