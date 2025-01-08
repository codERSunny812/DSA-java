package Oops.AcessControl;

public class A {
int x; //default acess modifier
String name;
private int age ;

public A(int x, String name){
    this.x=x;
    this.name=name;
}


    public static void main(String[] args) {
      A obj = new A(12,"sunny");

        System.out.println(obj.x); // x->12



    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
