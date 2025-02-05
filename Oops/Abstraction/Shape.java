package Oops.Abstraction;

abstract  public class Shape {
    static  int count = 0;
    String color;

    Shape(String color){
        count++;
        this.color=color;
    }

    //abstract method
    abstract double calculateArea();


    //normal function
    void printDisplay(){
        System.out.println("the color of the shape is"+color);
    }

    static void displayCount(){
        System.out.println("the value of the count is"+" "+count);
    }
}
