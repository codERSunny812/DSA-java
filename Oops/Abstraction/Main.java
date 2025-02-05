package Oops.Abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstraction in java");

        //object of abstract class
//        Shape obj = new Shape() {
//            @Override
//            double calculateArea() {
//                return 0;
//            }
//        } -->  you can initilised the abstract class directly


        System.out.println("subclass 1");
        Circle obj1 = new Circle("red",12);
        System.out.println("the area of the circle is"+obj1.calculateArea());
        obj1.printDisplay();
        obj1.displayCount(); //can be accessed without creating the instance
        Shape.displayCount();




        System.out.println("subclass 2");

        Rectangle obj2 = new Rectangle("blue",12,13);
        System.out.println("the area of the rectangle is :"+obj2.calculateArea());
        obj2.printDisplay();
        obj2.displayCount();
        Shape.displayCount();
    }
}
