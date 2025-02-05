package DataStructure.Strings;

public class CountOfString {
    public static void main(String[] args) {
        String input = "programming";

        // Create an array to store the count of each character
        int[] charCount = new int[26]; // Assuming only lowercase letters a-z

        // Convert the string to lowercase to handle case insensitivity (optional)
        input = input.toLowerCase();

        // Iterate through the string
        for (char ch : input.toCharArray()) {
//            if (ch >= 'a' && ch <= 'z') { // Ensure it's a lowercase alphabet
                charCount[ch - 'a']++; // Increment the count for the character
//            }
        }

        // Print the character counts
        for (int i = 0; i < charCount.length; i++) {

                System.out.println((char) (i + 'a') + " --> " + charCount[i]);

        }

    }
}
