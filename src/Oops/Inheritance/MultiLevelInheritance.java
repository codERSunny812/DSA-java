package Oops.Inheritance;

// Base class for animals
class Animals {
    String color;
    String name;
    // Display animal information
    public void getInfo() {
        System.out.println("Animal name: " + name + ", Color: " + color);
    }
}

class Tigers extends Animal {
    public Tigers(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

class BengalTigers extends Tigers {
    public BengalTigers(String name, String color) {
        super(name, color); // Call parent class constructor
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {
        BengalTigers b1 = new BengalTigers("Sallu", "Dark Yellow");
        b1.getInfo();
    }
}
