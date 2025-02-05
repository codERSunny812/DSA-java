package BasicMath;

public class NumberIsEven {

    static boolean  isNumberIsEven(int num){
        if( (num & 1) == 0) return true;

        return false;
    }
    public static void main(String[] args) {
        int number = 4;
        System.out.println((number & 1));

        boolean result = isNumberIsEven(number);

        System.out.println(result);
    }
}
