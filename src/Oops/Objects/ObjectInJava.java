package Oops.Objects;

public class ObjectInJava {
    int x;
    String name;

    public ObjectInJava() {
        System.out.println("default contructor");
    }

    public ObjectInJava(int x, String name) {
        this.x = x;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass [id=" + x + ", name=" + name + "]";
    }




}
