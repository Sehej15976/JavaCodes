//fibonacci series in java
//space optimized approach 
//1. Take two variables last and secondLast for storing (i-1)th and (i-2)th term.
//2. Now iterate from 2 to n and calculate the ith term. ith term is last + secondLast term.
//3.Then update secondLast term to the last term and the last term to ith term as we iterate.
class Problem1{
    public static void main(String[] args) {
        int n1=0, n2=1;
        int n3,count=20;

        System.out.print(n1+" "+n2);
        for(int i=2;i<count;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}