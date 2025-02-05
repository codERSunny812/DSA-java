package Recursion.EasyPrblm;

import java.util.Scanner;

public class SumOfDigits {

    static int calculateTheSum(int number){
        if(number == 0){
            return 0;
        }

        return number%10 + calculateTheSum(number/10);
    }
    public static void main(String[] args) {
        System.out.println("digits sum");
        Scanner sc = new Scanner(System.in);

        int digits = sc.nextInt();

        int sum = calculateTheSum(digits);
        System.out.println(sum);
    }
}
