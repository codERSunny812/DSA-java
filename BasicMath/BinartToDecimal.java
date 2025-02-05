package BasicMath;

public class BinartToDecimal {
    public static void main(String[] args) {
        System.out.println("decimal to binary conversion");

        int x = 12;
        StringBuilder str = new StringBuilder("");

        while(x>0){
            // Append the remainder when divided by 2 (0 or 1)
            str.append(x % 2);
            // Divide the number by 2 for the next iteration
            x = x / 2;
        }

        str.reverse();

        System.out.println(str.toString());
    }
}
