package Oops.Inheritance;

public class Human extends  Organism{
    String name;
    boolean isSpeak;

    Human(){
        System.out.println("default constructor of child is called:");
    }

    Human(String name){
        this.name=name;
        System.out.println("the created human name is:"+" "+name+"and he can speak:"+" "+isSpeak);
    }

    Human(String name , boolean isSpeak){
        this.name=name;
        this.isSpeak=isSpeak;
        System.out.println("the created human name is:"+" "+name+"and he can speak:"+" "+isSpeak);
    }

    Human(String name , boolean isSpeak ,int legs , int hands ,int eyes , int nose ,
          boolean isLiving , boolean isWalk){
        super(legs,hands,eyes,nose,isWalk,isLiving); //help in accessing the property of the parents element
        this.name=name;
        this.isSpeak=isSpeak;

        System.out.println("the created human name is:"+" "+name+"and he can speak:"+" "+isSpeak+
                "the organism is live :"+" "+isLiving+"and he can walk:"+" "+isWalk+"and he has"+" "+legs
                +"legs"+"and"+" "+hands+"hands and"+" "+eyes+"eyes and "+" "+nose);
    }
}
