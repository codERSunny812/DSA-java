package BasicMath;

public class OneComplement {
    static int ToBinary(int x){
        StringBuilder str = new StringBuilder();

        while(x>0){
            // Append the remainder when divided by 2 (0 or 1)
            str.append(x % 2);
            // Divide the number by 2 for the next iteration
            x = x / 2;
        }

        String num = str.reverse().toString();
        int number = Integer.parseInt(num);
        return  number;

    }
    public static void main(String[] args) {
        System.out.println("One's complement of a number");

        int x = 122;
        int y = ToBinary(x);
        int z = ~y;
        System.out.println(z);
    }
}
