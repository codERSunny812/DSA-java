package Oops;


// shape class
class Shape{
    int length;
    int width;
    int height;

//    default constructor
//    public Shape(){
//// Compiler generates this if no other constructor exists
//        System.out.println("hello from the default contructor");
//    }

   // parameterised contructor
    public Shape(int length , int width , int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

//    copy constructor
    public Shape(Shape obj){
        this.length=obj.length;
        this.width=obj.width;
        this.height=obj.height;
    }

    //construtor overloading

    public Shape(){
        this(-1, -1, -1); // Calls the three-parameter constructor

    }

    public Shape(int length){
        this.length=length;
    }

    public Shape(int length , int width){
        this.length=length;
        this.width=width;
    }




//    function which tells about the class value based on the type of connstructor
    public void aboutTheClass(){
        System.out.println(
         "The instance create by you has the length of "+" "+length+" "+"and the"+
         "width is"+" "+width+" "+"and the height is"+" "+height
        );
    }
}

class Parent {
    int value;

    // Parent Constructor
    public Parent(int value) {
        this.value = value;
        System.out.println("Parent constructor called with value: " + value);
    }
}

class Child extends Parent {
    int childValue;

    // Child Constructor
    public Child(int parentValue, int childValue) {
        super(parentValue); // Calls Parent class constructor
        this.childValue = childValue;
        System.out.println("Child constructor called with value: " + childValue);
    }
}

public class ConstructorExplain {
    public static void main(String[] args) {
        System.out.println("constructor types:");

        System.out.println("1. default constructor:");
//        A constructor created automatically by the compiler if no other constructor is defined
//        Takes no parameters and initializes member variables to default values

        Shape square = new Shape(); // an instance of the class
        System.out.println(square);

//        calling the class function
        square.aboutTheClass();

        System.out.println("2. parameterised constructor");

//        Takes parameters and initializes object attributes with the provided values
//        Allows customization during object creation

//        another instanceof  the class
        Shape rectangle = new Shape(12,12,11);
        rectangle.aboutTheClass();


        System.out.println("3. copy constructor:");
//        Creates a new object as a copy of an existing object
//        Useful for creating deep copies of objects
        Shape parllelogram = new Shape(rectangle);
        parllelogram.aboutTheClass();


        System.out.println("4. static constructor");
//        Used to initialize static members
//        Called only once when the class is first loaded


        System.out.println("Key Related Concepts:");


        System.out.println("constructor overloading");
//        Multiple constructors in the same class with different parameter lists
//      Allows object creation with different sets of initial values

// Shape square = new Shape(); // Calls the default constructor
//Shape rectangle = new Shape(12, 12, 11); // Calls the parameterized constructor
Shape quadrillateral = new Shape(1, 4); // Calls the two-parameter constructor



        quadrillateral.aboutTheClass();


        System.out.println("contructor chaining");
//        Constructor chaining is the process of calling one constructor from another
//        constructor in the same class orin a parent class. The main goal of constructor
//        chaining is code reuse:

//        There are two types of constructor chaining:
//        Within the same class (using this keyword)
//        Between a subclass and a superclass (using super keyword)

        Child child = new Child(100, 200);
        System.out.println(child);





    }
}
