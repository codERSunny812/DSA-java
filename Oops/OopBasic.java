package Oops;

public class OopBasic {
    public static void main(String[] args) {
        System.out.println("OOps basic in java");

        //object of the class
        ClassBasic human = new ClassBasic(); //uses the default constructor

        System.out.println(human); // output: Oops.ClassBasic@67b64c45

// now initilising the object with value:

//accesiing the value before initilization will print the default value of the variable:

        //if we didnot decalare any constructor into our  program then the
        // java create a defautl constructor which assign the instance variable with the default value.
        System.out.println(human.leg+" "+human.hand+" "+human.name+" "+human.isSpeak);
        human.hand=2;
        human.leg=2;
        human.name="sunny";
        human.isSpeak=true;
        System.out.println("the object of the living things class is human and he has "
                +human.leg+" legs "+" and "+human.hand+" hand "+" and his name is: "+human.name);

//  But assing code like this will make our code message then for that we will use contructor

        ClassBasic plant = new ClassBasic(0,0,"Banyan tree",false);
         plant.aboutInstance();



    }
}
