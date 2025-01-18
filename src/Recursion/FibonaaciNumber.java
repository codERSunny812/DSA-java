package Recursion;

import java.util.Scanner;

public class FibonaaciNumber {
    static void printFiboo(int num){
        if(num == 0){
            System.out.println("0");
        }

        if(num == 1){
            System.out.println("1");
        }

//       printFiboo(num-1)+printFiboo(num-2);
    }
    public static void main(String[] args) {
        System.out.println("Fibonaaci number:");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        printFiboo(num);
    }
}
