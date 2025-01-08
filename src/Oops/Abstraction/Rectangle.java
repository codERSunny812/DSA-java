package Oops.Abstraction;

public class Rectangle extends  Shape{

    double length;
    double width;

    public  Rectangle(String color ,double length , double width){
        super(color);
        this.length=length;
        this.width=width;
    }

    //implement the method

    @Override
    double calculateArea(){
        return length*width;
    }
}
