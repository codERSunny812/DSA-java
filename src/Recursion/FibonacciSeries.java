package Recursion;

import java.util.Scanner;

public class FibonacciSeries {

    static int fib(int num) {
        // base condition
        if (num < 2) {
            return num;
        }
        // recursive relation
        return fib(num - 1) + fib(num - 2);
    }

    static void printFibonacciSeries(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to print the Fibonacci series:");
        int number = sc.nextInt();
        sc.close();
        printFibonacciSeries(number);
    }
}
