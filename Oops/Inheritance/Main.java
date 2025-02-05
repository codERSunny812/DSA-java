package Oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("inheritance in java");
//        Organism table = new Organism();
//
//        Organism chair = new Organism(false);
        System.out.println("object -1 :");
        Human h1 = new Human(); //both default constructor is called
        System.out.println("object -2 :");
        Human h2 = new Human("sunny");
        System.out.println("object -3 :");
        Human h3 = new Human("shivam",false);
        System.out.println("object -4 :");
        Human h4 = new Human("shiv",true);
        System.out.println("object -5 :");
        Human h5 = new Human("manas",true,2,2,2,1,true,true);


        System.out.println("single level inheritance");


    }
}
