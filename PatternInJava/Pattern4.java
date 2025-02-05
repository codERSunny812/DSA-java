package PatternInJava;

public class Pattern4 {
    public static void main(String[] args) {
//        inverted half pyramid
        for (int i = 0; i <5 ; i++) {
            for (int j = 5; j>i ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
