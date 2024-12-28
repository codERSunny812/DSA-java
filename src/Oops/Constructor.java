package Oops;

class Car {

    String brand;
    int speed;

//default constructor
    Car(){
        //constructor chaining
        this("unkown",0); //calling parameterised constructor
        System.out.println("this is the non parameterized constructor");
    }
    // Parameterized Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

//    copy construcotor
    Car (Car car){
        this.brand=car.brand;
        this.speed=car.speed;
    }
    void display() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }


}

public class Constructor {
    public static void main(String[] args) {
        System.out.println("construtors in java");

        System.out.println("object 1 with default constructor:");

       Car myCar = new Car();
       myCar.display();

        System.out.println("object 2 with default constructor:");

        Car myCar0 = new Car();
        myCar0.brand="mercedes";
        myCar0.speed=160;
        myCar0.display();

        System.out.println("Object 3 with parameterised construcotr:");
        Car myCar1 = new Car("Tesla", 120); // Passing values to the constructor
        myCar1.display(); // Output: Tesla is driving at 120 km/h
        System.out.println("object 4 with parameterised constructor");
        Car myCar2 = new Car("Jaguar",190);
        myCar2.display();


        System.out.println("object 5 with copy construcot:r");

//        copy construtor
        Car  myCar3 = new Car(myCar2);
        myCar3.display();

        System.out.println("object 6 with copy constructor");
////        constructor chaining
        Car defaultCar = new Car();
        defaultCar.display(); // Output: Unknown is driving at 0 km/h
//
//        Car myCar3 = new Car("Ford", 80);
//        myCar3.display(); // Output: Ford is driving at 80 km/h
    }
}
