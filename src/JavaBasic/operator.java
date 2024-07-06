package JavaBasic;

public class operator {

    static void printFront(int num){
        if(num > 6){
            return;
        }

        System.out.print(num + " ");

        printFront(++num);
    }

    public static void main(String[] args) {
        //lets know about the operator

//        int N=10;
        int num = 0;
//        printNum(N);
//        printReverse(N);
        printFront(num);
    }
}
