package Recursion.EasyPrblm;

import java.util.Scanner;

public class OneToN {

    static  void printNum(int num){
        if(num<1) return;


        printNum(num-1);
        System.out.print(num+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int number = sc.nextInt();

        printNum(number);
    }
}
