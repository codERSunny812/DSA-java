package Recursion;

public class ReverseOfNum {

    public static void main(String[] args) {
        reverseTheNum(134);

        System.out.println(sum);
    }


static  int sum = 0;
    static void reverseTheNum(int n){

        //base condition
        if(n == 0) return  ;

        int remainder = n%10;

        sum = sum*10 + remainder;

        reverseTheNum(n/10);


//
    }
}
