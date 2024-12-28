package Oops;

// Polymorphism with Method Overloading
class Shape {

    // Calculate area of a circle
    public void area(double radius) {
        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + areaOfCircle);
    }

    // Calculate area of a rectangle
    public void area(double length, double width) {
        double areaOfRectangle = length * width;
        System.out.println("The area of the rectangle is: " + areaOfRectangle);
    }
}

// Base class for animals
class Animal {
    String color;
    String name;

    // Display animal information
    public void getInfo() {
        System.out.println("Animal name: " + name + ", Color: " + color);
    }
}

// Single-level inheritance
class Tiger extends Animal {
    public Tiger(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

// Multi-level inheritance
class BengalTiger extends Tiger {
    public BengalTiger(String name, String color) {
        super(name, color); // Call parent class constructor
    }
}

// Hierarchical inheritance
class Elephant extends Animal {
    public Elephant(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

// Encapsulation and Abstraction example
abstract class Drink {

    int amount; // Amount in ml
    String name; // Name of the drink

    // Abstract method to be implemented by subclasses
    public abstract void aboutDrink();

    // Common method for displaying drink details
    public void displayDrinkDetails() {
        System.out.println("Drink Name: " + name + ", Amount: " + amount + " ml");
    }
}

// Coke class extends Drink and provides its implementation
class Coke extends Drink {

    public Coke(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void aboutDrink() {
        System.out.println("This is a Coke drink. Drink Name: " + name + ", Amount: " + amount + " ml");
    }
}

// Juice class extends Drink and provides its implementation
class Juice extends Drink {

    public Juice(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void aboutDrink() {
        System.out.println("This is a Juice drink. Drink Name: " + name + ", Amount: " + amount + " ml");
    }
}

// Encapsulation with private variables and getters/setters
class Encapsulation {

    // Private variables
    private int rating;
    private String coder;
    private int age;

    // Getter for rating
    public int getRating() {
        return rating;
    }

    // Getter for coder
    public String getCoder() {
        return coder;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int newValue) {
        age = newValue;
    }

    // Setter for coder
    public void setCoder(String newValue) {
        coder = newValue;
    }

    // Setter for rating
    public void setRating(int newValue) {
        rating = newValue;
    }
}

// Main class to demonstrate all concepts
public class OOPS {
    public static void main(String[] args) {

        System.out.println("polymorphism");
        // Polymorphism with method overloading
        Shape circle = new Shape();
        circle.area(4); // Area of a circle
        Shape rectangle = new Shape();
        rectangle.area(12, 12); // Area of a rectangle


        System.out.println("inhertiance ");
        // Single-level inheritance
        Tiger t1 = new Tiger("Selmon", "Yellow");
        t1.getInfo();

        // Multi-level inheritance
        BengalTiger b1 = new BengalTiger("Sallu", "Dark Yellow");
        b1.getInfo();

        // Hierarchical inheritance
        Elephant E1 = new Elephant("Ramu", "Grey");
        E1.getInfo();

        System.out.println("encapsulation");

        // Encapsulation example
        Encapsulation codingNinja = new Encapsulation();
        codingNinja.setCoder("Ankush");
        codingNinja.setAge(39);
        codingNinja.setRating(1900);

        System.out.println("Coder: " + codingNinja.getCoder());
        System.out.println("Age: " + codingNinja.getAge());
        System.out.println("Rating: " + codingNinja.getRating());

        System.out.println("abstraction");

        // Abstraction example
        Drink coke = new Coke("Coca-Cola", 500);
        coke.aboutDrink(); // Calls Coke-specific method
        coke.displayDrinkDetails(); // Common method from Drink class

        Drink juice = new Juice("Orange Juice", 300);
        juice.aboutDrink(); // Calls Juice-specific method
        juice.displayDrinkDetails(); // Common method from Drink class
    }
}
