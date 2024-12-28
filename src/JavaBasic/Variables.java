package JavaBasic;

public class Variables {
    static int z = 12; // Static variable
    public int h = 12; // Instance variable

    public static void main(String[] args) {
        System.out.println("variables in java");

        // Static variable
        System.out.println("Static variable z: " + z);

        // Call a static method
        sum(z);

        // Create an instance to access the instance variable
        Variables obj = new Variables();
        System.out.println("Instance variable h: " + obj.h);

        // Local variable demonstration
        int a = 10; // Local variable
        if (a > 5) {
            int b = 5; // Local variable inside block
            System.out.println("Local variable b: " + b);
            a += b;
        }
        System.out.println("Local variable a after modification: " + a);
    }

    public static void sum(int num) {
        System.out.println("Sum of num and z: " + (num + z));
    }
}
