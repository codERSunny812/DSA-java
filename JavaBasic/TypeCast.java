package JavaBasic;

public class TypeCast {
    public static  void main(String [] args){
        System.out.println("TypeCasting in java:");
        byte x = 12;
        short y = 13;
        int z = x+y; // this is known as widening
        System.out.println(z);

        int a = 32;
        float b = 32.1f;
        short c = (short) ((short)a+ (short)b); // this is known as narrowing


    }
}
