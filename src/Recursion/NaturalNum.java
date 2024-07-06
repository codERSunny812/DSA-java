package Recursion;

public class NaturalNum {

    public static void main(String[] args) {

      printNum(7);

      printReverseNum(7);
    }


    static void printNum(int n){

        if(n==0){
            return;
        }

        System.out.println(n);


        printNum(--n);
    }

    static void printReverseNum(int m){
        if(m<=1) return ;


        printReverseNum(--m);
        System.out.println(m);
    }
}
