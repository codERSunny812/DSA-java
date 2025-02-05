package Methods;

import java.util.Scanner;

public class SumOfTwoNum {
    public static int sum(int num1, int num2){
        return num1+num2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        int value = sum(num1,num2);

        System.out.println("the sum of the number are:"+value);

    }
}
