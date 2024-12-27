package BasicMath;

public class ReverseANumber {
    public static void main(String[] args) {
        int number = 9813;
        int reversedNumber = 0;

        while (number > 0) {

            int lastDigit = number%10;
            reversedNumber = reversedNumber*10+lastDigit;
            number=number/10;
        }

        System.out.println(reversedNumber);
        System.out.println(number);
    }
}
