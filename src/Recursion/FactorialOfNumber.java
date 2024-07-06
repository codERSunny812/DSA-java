package Recursion;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num = Fact(6);
        System.out.println(num);
    }

    static  int Fact(int n){
        //base condition
        if(n<2) return 1;

        return n*Fact(--n);
    }
}
