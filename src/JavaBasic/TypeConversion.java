package JavaBasic;

public class TypeConversion {

    public static void main(String[] args) {
        // implicit type conversion
        /* converting a smaller value into a large value is know as implicit type conversion or it's also called widening */
        short num = 12;
        //converting this short into int

        int numInt = num;

        //converting this int into long

        long numLong = numInt;


        // explicit type conversion

        /*
         * converting a larger value into a smaller value is know as implicit type
         * conversion or it's also called narrowing
         */

        long value = 134;

        short valueShort = (short)value;

    }



}
