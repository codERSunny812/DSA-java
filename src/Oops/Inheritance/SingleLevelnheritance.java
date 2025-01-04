package Oops.Inheritance;

//// Base class for animals
class Animal {
    String color;
    String name;
    // Display animal information
    public void getInfo() {
        System.out.println("Animal name: " + name + ", Color: " + color);
    }
}

class Tiger extends Animal {
    public Tiger(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

public class SingleLevelnheritance {
    public static void main(String[] args) {
        // Single-level inheritance
        Tiger t1 = new Tiger("Selmon", "Yellow");
        t1.getInfo();
    }

}
