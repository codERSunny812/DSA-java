package Oops.Polymorphism;

class A{
    String name;

    A(){
        System.out.println("default constructor of A");
    }
    void show(){
        System.out.println("hello from the the function A");
    }

    void display(){
        System.out.println("hi im java");
    }
}


class B extends  A{
    int number;
    B(){
        System.out.println("default constructor of B");
    }
    @Override
    void show(){
        System.out.println("hello from the function B");
    }
    @Override
    void display(){
        System.out.println("hii im python");
    }

    void extraFun(){
        System.out.println("hola");
    }
}
public class MoreAboutPolymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); // show is runnig from function A
        obj.display(); // display is running from A

        A obj2 = new B();
        obj2.display();
        obj2.show();

        B obj3 = new B();
        obj3.display();
        obj3.show();
        obj3.extraFun();



    }
}
