package Oops;


class CustomException extends  Exception{
    public CustomException(String message){
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("exception handling in java");

        try {
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }


        //custom exception in java

        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
