package Recursion.EasyPrblm;

import java.util.Scanner;

public class Nto1 {

    static  void printNum(int num){
        if(num<1) return;

        System.out.print(num+" ");
        printNum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int number = sc.nextInt();

        printNum(number);
    }
}
