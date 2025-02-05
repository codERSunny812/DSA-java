package JavaBasic;

public class DataType {
    public static void main(String[] args) {
//        data type in java

        // Primitive Data Types
//        These data type are stored in the stack memory
        byte b = 10;
        int age = 25;
        double salary = 50000.75;
        char grade = 'A';
        boolean isJavaFun = true;
        float percantage = 75.5f;

        // Non-Primitive Data Types
//These are stored in the heap memory and the refrence are stored in the stack memory
        String name = "Alice";
        int[] marks = {85, 90, 78};

        // Printing the values
        System.out.println("Byte Value: " + b);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Name: " + name);
        System.out.println("percantage:"+percantage);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);

    }

}
