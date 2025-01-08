package Oops.Interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Interface in java");
        Dog obj1 = new Dog();
        obj1.eat();
        obj1.sound();
        obj1.sleep();
        Animal.walk();
        Animal dog = new Dog(); // Polymorphism
        dog.eat();
        dog.sound();
    }
}
