package Oops;

//for static variable
class Counter{
   static int count = 0; //shared variable across all object

    Counter(){
        count++;
    }

    void display(){
        System.out.println("count value :"+count);
    }
}

//for static method
class StaticMethodExplaination{
    static int a=12; //static variable
    static int b = 19; // static variable
    int x = 131;

    //static method
    static void printNum(){
        System.out.println(a); //acessing the static variable
//        System.out.println(x); // cant acess the instane variable direclty

        //another static method
        printText();
    }


    //another static method
    static void printText(){
        System.out.println("this is a static method");
    }

    //instance variable
    void instanceMethod(){
        System.out.println("this is a instance method");
        System.out.println("instance variable:"+x);
        System.out.println("static variable: "+b);
    }


   static int sumOfNum(int p, int q){
        return p+q+a+b;
    }


}

//for static block
class StaticBlock{
    static int a; //static variable declare

    static {
        a=90;
        System.out.println("the value is initilised to the  static variable using the static block:");
    }
}


//static classes

class Outer{
    static int x = 12;

    static class Inner{
        //static method
        static void dis(){
            x = 10;
            System.out.println("x:"+x);
        }

        void display(){
            System.out.println("x:"+x);
        }
    }
}


public class StaticKeyWord {
    public static void main(String[] args) {
        System.out.println("all about static keyword");

        System.out.println("static variable in java:");
        Counter c1 = new Counter();
        System.out.println(Counter.count); //can be call only using the class name
        c1.display();
        Counter c2 = new Counter();
        c2.display();
        Counter c3 = new Counter();
        c3.display();

        System.out.println("static method in java:");
        // Calling the static method without creating the object
        StaticMethodExplaination.printNum();

        //creating object to acess the instance method
        StaticMethodExplaination ex = new StaticMethodExplaination();
        ex.instanceMethod();

        int result = StaticMethodExplaination.sumOfNum(91,12);
        System.out.println(result);

        System.out.println("static block in java: ");

        System.out.println(StaticBlock.a);


        System.out.println("static classes in java:");

        Outer.Inner nestedObject = new Outer.Inner();
        nestedObject.display();



    }
}
