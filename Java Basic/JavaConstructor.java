// package Java Basic;

public class JavaConstructor { 

    // Instance variables
    private String name;
    private int age;

    // Default constructor
    public JavaConstructor() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public JavaConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }



    public static void main(String[] args) {
        // this is an example of default 
        JavaConstructor first = new JavaConstructor(); //object is created for the class
        // parametrised constructor
       JavaConstructor geek1 = new JavaConstructor("avinash", 68);
        

        // Displaying the information 
        System.out.println("first:");
        first.displayInfo();

        System.out.println("\nsecond:");
       System.out.println("seconf :" + geek1.name
                           + " and GeekId :" + geek1.age);

    }
}
