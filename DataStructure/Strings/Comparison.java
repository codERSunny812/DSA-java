package DataStructure.Strings;

public class Comparison {
    public static void main(String[] args) {
        System.out.println("String comparison in java");

        String a = "sunny";
        String b = "sunny";
        String c = new String("sunny");

        System.out.println(a==b); //true
        System.out.println(a==c); //false due to new object is created

        System.out.println(a.equals(c)); //true as this compares only the string values not the refrence
    }
}
