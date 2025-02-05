package Oops.Abstraction;

public class Circle extends  Shape {
    double radius;

    public Circle(String color , double radius){
        super(color);
        this.radius=radius;
    }

    //implememt the abstract method
    @Override
    double calculateArea(){
        return  Math.PI*radius*radius;
    }


}
