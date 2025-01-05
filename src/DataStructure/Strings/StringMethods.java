package DataStructure.Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("String methods");

        String str = "  Java Programming is Fun  ";

        System.out.println("Original: " + str);
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(7, 18));
        System.out.println("Replaced: " + str.replace("Java", "Python"));
        System.out.println("Starts with '  Java': " + str.startsWith("  Java"));
        System.out.println("Contains 'Fun': " + str.contains("Fun"));
        System.out.println("trimmed:"+str.strip());


        String str2 = "apple,banana,cherry";

        // Splitting
        String[] fruits = str2.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Joining
        String joined = String.join(" - ", fruits);
        System.out.println("Joined: " + joined);


    }
}
