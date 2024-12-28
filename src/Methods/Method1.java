package Methods;

import java.util.Scanner;

public class Method1 {
    public static void printName(String name){
        System.out.println("my name is:"+name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();

        printName(name); //function call
    }
}
