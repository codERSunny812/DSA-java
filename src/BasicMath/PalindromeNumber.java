package BasicMath;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int reversedNumber = 0;
        int realNumber = number;

        while (number > 0) {

            int lastDigit = number%10;
            reversedNumber = reversedNumber*10+lastDigit;
            number=number/10;
        }


        if(realNumber == reversedNumber){
            System.out.println("its a palindrome number");
        }else{
            System.out.println("its not a palindrome number");
        }


    }
}
