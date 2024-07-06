package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int size = 7;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
