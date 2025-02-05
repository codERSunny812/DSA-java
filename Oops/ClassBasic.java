package Oops;

public class ClassBasic {
    //suppose this is a class of living things
    int hand;
    int leg;
    String name;
    boolean isSpeak;

    ClassBasic(){
        System.out.println("this is the default constructor");
    }

    // parameterised constructor:
    ClassBasic (int hand , int leg , String name , boolean isSpeak){
        this.hand=hand;
        this.leg=leg;
        this.name=name;
        this.isSpeak=isSpeak;
    }
    public void  aboutInstance(){
        System.out.println("the created object has "+this.hand+"hands and "+
                this.leg+"legs and the name of the object is:"+this.name+"and does he can speak"+this.isSpeak);
    }
}
