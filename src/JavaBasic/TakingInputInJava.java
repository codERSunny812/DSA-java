package JavaBasic;

import java.util.Scanner;

public class TakingInputInJava {
    public static void main(String[] args) {
//        how to take input in java from user
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num1 = sc.nextInt();
        System.out.println("enter the number 2");
        int num2 = sc.nextInt();

        sc.close();

        int sum = num1+ num2;

        System.out.print("the sum of the number is:");
        System.out.println(sum);
    }
}
