package Recursion.EasyPrblm;

import java.util.Scanner;

public class SumOfN {
    static int calculateSum(int num){
        if(num<1) return 0;

        return num + calculateSum(num-1);
    }
    public static void main(String[] args) {
        System.out.println("sum of N digits");
        Scanner sc  = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = calculateSum(num);
        System.out.println(sum);
    }
}
