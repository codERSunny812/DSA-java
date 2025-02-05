package Oops.Inheritance;

public class Organism {
    int legs;
    int hands;
    int eyes;
    int nose;
    boolean isLiving;
    boolean isWalk;

    //constructors

    Organism(){
        System.out.println("default constructor of parent is called");
    }

    Organism(boolean isLiving){
        this.isLiving=isLiving;

        System.out.println("the organism is live :"+isLiving);
    }

    Organism(boolean isLiving , boolean isWalk){
        this.isLiving=isLiving;
        this.isWalk=isWalk;
        System.out.println("the organism is living:"+isLiving+"and he can walk:"+isWalk);
    }


    Organism(int legs, int hands , int eyes , int nose , boolean isWalk , boolean isLiving){
        this.legs=legs;
        this.hands=hands;
        this.eyes=eyes;
        this.nose=nose;
        this.isWalk=isWalk;
        this.isLiving=isLiving;

        System.out.println("the organism is live :"+isLiving+"and he can walk:"+isWalk+"and he has"+legs
        +"legs"+"and"+hands+"hands and"+eyes+"eyes and "+nose);
    }
}
