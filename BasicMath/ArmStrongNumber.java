package BasicMath;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int number = 1634;          // Input number
        int realNumber = number;   // Store the original number
        int sum = 0;

        // Calculate the number of digits by converting it into string
        int digits = String.valueOf(number).length();

        // Calculate the sum of the n-th powers of its digits
        while (number > 0) {
            int lastDigit = number % 10; // Extract the last digit
            sum += (int) Math.pow(lastDigit, digits); // Raise the digit to the power of 'digits'
            number = number / 10;       // Remove the last digit
        }

        // Check if the sum equals the original number
        if (realNumber == sum) {
            System.out.println(realNumber + " is an Armstrong number.");
        } else {
            System.out.println(realNumber + " is not an Armstrong number.");
        }


    }
}
