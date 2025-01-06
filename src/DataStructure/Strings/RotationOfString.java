package DataStructure.Strings;

public class RotationOfString {
    static String rotateClockWise(String sentence) {
        // Handle edge cases
        if (sentence == null || sentence.length() <= 1) {
            return sentence; // No rotation needed for empty or single-character strings
        }

        // Extract the last character
        char lastChar = sentence.charAt(sentence.length() - 1);

        // Append the last character at the beginning and exclude it from the end
        String rotated = sentence.substring(0, sentence.length() - 1)+lastChar ;

        return rotated; // Return the rotated string
    }

    public static void main(String[] args) {
        System.out.println("Rotation in string:");

        // Input string
        String str = "hello my name is sunny";

        // Perform clockwise rotation
        String clockwise = rotateClockWise(str);

        // Output the result
        System.out.println("Original String: " + str);
        System.out.println("Clockwise Rotation: " + clockwise);
    }
}
