package Oops.AcessControl;



public class Main {
    public static void main(String[] args) {
        System.out.println("acess control in java");

        A obj = new A(12,"sun");
        System.out.println(obj.x); // can be acessed in the same package

//        obj.age  -> acess is not allowed as it's private

        obj.setAge(13);
        System.out.println(obj.getAge()); //acess is allowed

    }
}
