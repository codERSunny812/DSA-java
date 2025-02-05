package Oops.Abstraction;

// Abstraction example
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

public class AbstractionInJava {
    public static void main(String[] args) {
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
