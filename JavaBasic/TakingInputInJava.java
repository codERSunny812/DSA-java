package JavaBasic;

import java.util.Scanner;

public class TakingInputInJava {
    public static void main(String[] args) {
//        taking input in  java
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("enter your name");
        String name = sc.nextLine();

        System.out.println("my name is "+" "+name+"and my age is"+" "+number);
    }

}
