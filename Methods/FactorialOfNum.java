package Methods;

import java.util.Scanner;

public class FactorialOfNum {
    public static void findFactorial(int num){
        int factorial = 1;
        if(num<0){
            System.out.println("invalid number");
            return;
        }
        for(int i=num;i>=1;i--){
            factorial*=i;
        }
        System.out.println("the factorial of the number is:"+factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for factorial:");
        int num = sc.nextInt();
        findFactorial(num);
    }
}
