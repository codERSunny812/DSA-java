package Oops.Generics;
//here T is an parameter which is being replaced when the object is creating of type
class GenericUses<T>{
    private T value;

    public  void setValue(T value){
        this.value=value;
    }

    public  T getValue(){
     return value;
    }

}


class GenericMethod{
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element+"-->");
        }
        System.out.println();
    }
}

//we can restrict type parameter to a specific range of type using extends

class Calculator<T extends Number> {
    public double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}


public class GenericClass {
    public static void main(String[] args) {
        GenericUses<String> str = new GenericUses<>();
        str.setValue("sunny");
        System.out.println(str.getValue()); //output hello


        GenericUses<Integer> num = new GenericUses<>();
        num.setValue(123);
        System.out.println(num.getValue()); //output: 123


        String[] strArray = {"A", "B", "C"};
        Integer[] intArray = {1, 2, 3};

        GenericMethod.printArray(strArray); // Prints A, B, C
        GenericMethod.printArray(intArray); // Prints 1, 2, 3

        Calculator<Integer> calc = new Calculator<>();
        System.out.println(calc.add(10, 20)); // Output: 30.0

        Calculator<Double> calcDouble = new Calculator<>();
        System.out.println(calcDouble.add(5.5, 2.3)); // Output: 7.8



        // wild cards in generics




    }
}
