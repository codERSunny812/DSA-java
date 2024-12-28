package Methods;

import java.util.Scanner;

public class FindAverage {

    public static float calculateAvg(int num1,int num2,int num3){
        return (float) (num1 + num2 + num3) /3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three numbers:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();

        float average = calculateAvg(num1,num2,num3);

        System.out.println("the average of the number is:"+average);

    }
}
