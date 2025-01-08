package Oops.Objects;

public class Main {
    public static void main(String[] args) {
//        The Object class in Java is the root class of the Java class hierarchy.
//        Every class in Java implicitly or explicitly extends the Object class.
        System.out.println("object classes in java");

        System.out.println("Method in Object");

        ObjectInJava obj = new ObjectInJava(23,"sunny");

        System.out.println(obj.toString()); //string representation of object

        //2. equals
//        The equals() method is used to compare objects for equality.
//        By default, equals() checks for reference equality
//        (whether two references point to the same object in memory)
         ObjectInJava obj1 = new ObjectInJava();
         ObjectInJava obj2 = new ObjectInJava();

        System.out.println(obj1.equals(obj2)); //false

        // 3. hashNode



    }
}
