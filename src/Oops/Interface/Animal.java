package Oops.Interface;

//Define an interface
public interface Animal {
//    abstract methods
    abstract  void sound();
    abstract  void eat();

    //static method
    static void walk(){
        System.out.println("animal can walk");
    }

    //default method
    default  void sleep(){
        show();
        System.out.println("animal is sleeping");
    }

    //private method in java
    private void show(){
        System.out.println("this is a private function");
    }
}
