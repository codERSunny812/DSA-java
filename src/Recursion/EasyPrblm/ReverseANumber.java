package Recursion.EasyPrblm;

public class ReverseANumber {
    static int reverseNumber(int n){
        //base case
        if(n==0){
            return 1;
        }


        int lastDigit = n%10;

        return lastDigit*10 + reverseNumber(n/10);
    }
    public static void main(String[] args) {
        int number = 1245;
        int reversed = reverseNumber(number);
        System.out.println(reversed);
    }
}
