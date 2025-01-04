package Oops.Inheritance;

class Animalss {
    String color;
    String name;
    // Display animal information
    public void getInfo() {
        System.out.println("Animal name: " + name + ", Color: " + color);
    }
}

class Tigerss extends Animalss {
    public Tigerss(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

class BengalTigerss extends Tigerss {
    public BengalTigerss(String name, String color) {
        super(name, color); // Call parent class constructor
    }
}



// Hierarchical inheritance
class Elephants extends Animals {
    public Elephants(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

public class HierarichalInheritance {
    public static void main(String[] args) {
        // Hierarchical inheritance
        Elephants E1 = new Elephants("Ramu", "Grey");
        E1.getInfo();
    }

}
