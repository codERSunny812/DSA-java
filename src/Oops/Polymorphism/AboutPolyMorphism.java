package Oops.Polymorphism;

class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    // Method in the superclass
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the superclass method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the superclass method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class AboutPolyMorphism {
    public static void main(String[] args) {
        System.out.println("polymorphism in java");

        System.out.println("1. compile time polymorphism:");

        Calculator calc = new Calculator();

        // Using the overloaded methods
        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + calc.add(10.5, 20.3));

        System.out.println("2. Run time polymorphism:");


        Animal myAnimal; // Reference of superclass

        // Assigning subclass objects to the superclass reference
        myAnimal = new Dog();
        myAnimal.sound(); // Output: Dog barks

        myAnimal = new Cat();
        myAnimal.sound(); // Output: Cat meows
    }
}
