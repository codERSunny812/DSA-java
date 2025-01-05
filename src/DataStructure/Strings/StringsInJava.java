package DataStructure.Strings;

public class StringsInJava {
    public static void main(String[] args) {
        System.out.println("Strings in java");

        //creation of string

//        1. using the string litreals
        String str1 = "Hello";
        String str2 = "Hello"; // Points to the same object as str1 in the String Pool

//        2. using the new keyword
        String str3 = new String("Hello"); //create a new object in the heap


//        important concept about  strings

//        Strings in java are immutable
        String str = "Java";
        str.concat(" Programming"); // Creates a new string "Java Programming"
        System.out.println(str);    // Output: Java (original string remains unchanged)

//        2. String Pool

// Strings created using literals are stored in a special memory area called the String Pool.
// Strings with the same content share the same memory location in the pool, reducing memory usage.



    }
}
//