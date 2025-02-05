package PatternInJava;

public class Pattern5 {
    public static void main(String[] args) {
//        inverted rotated pyramid
        for (int i = 0; i <4 ; i++) {
            for (int j = 4; j>i ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
