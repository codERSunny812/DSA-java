package Methods;

import java.util.Scanner;

public class SumOfOddNum {
    public  static  void findSum(int number){
        int sum = 0;
        for(int i=0;i<number;i++){
            if(i%2 != 0){
                sum+=i;
            }
        }

        System.out.println("the sum of the number is:"+sum);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number");
        int  num = sc.nextInt();

        findSum(num);

    }
}
