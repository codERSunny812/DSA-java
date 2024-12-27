package BasicMath;

public class PrintDivisor {
    public static void main(String[] args) {
        int number = 36;

        // Declare an array to store divisors
        int[] arr = new int[number];
        int index = 0;

        // Find divisors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if 'i' is a divisor of 'number'
                arr[index] = i;
                index++;
            }
        }

        // Print the divisors
        System.out.println("Divisors of " + number + " are:");
        for (int j = 0; j < index; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
