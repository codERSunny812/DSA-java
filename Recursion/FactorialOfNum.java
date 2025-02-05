package Recursion;

public class FactorialOfNum {
    static  int Fact(int n){
        //base condition
        if(n<1) return 1;

        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of a  number using recursion");
        int number = 5;
        System.out.println(Fact(number));
    }
}
