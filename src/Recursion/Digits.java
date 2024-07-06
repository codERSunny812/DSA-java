package Recursion;

public class Digits {

    public static void main(String[] args) {

        //sum of the digits  and products of the digits

        int num = sumOfDigit(1387);
        int digit = productOfNum(209);

        System.out.println(num);
        System.out.println(digit);
    }

    static int sumOfDigit(int n){

        //base condition

        if(n == 0){
            return 0;
        }

        int sum = n %10;

        return sum + sumOfDigit(n/10);
    }

    static int productOfNum(int n){
        if( n%10 == n) return  n;

        return n%10 * productOfNum(n/10);
    }
}
