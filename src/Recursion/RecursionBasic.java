package Recursion;

public class RecursionBasic {
    static void printNum(int n){
        if(n==0) return;

        printNum(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        System.out.println("recursion basic");
        int N=10;
        printNum(N);
    }
}
