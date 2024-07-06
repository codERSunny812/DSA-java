package Recursion;

public class SumOfNaturalNumber {

    static  int findSum(int n){
        //base condition
        if(n ==0) return 0;

        return n + findSum(--n);
    }
    public static void main(String[] args) {
        int num = 6;
        int sumOfNumber = findSum(num);
        System.out.println(sumOfNumber);
    }
}
