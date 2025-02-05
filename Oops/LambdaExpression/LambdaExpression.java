package Oops.LambdaExpression;

import java.util.ArrayList;

public class LambdaExpression {
    public static void main(String[] args) {
        System.out.println("Lambda expression in java");
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Using Anonymous Class
        names.forEach(new java.util.function.Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        // Using Anonymous Class
        names.forEach( name-> System.out.print(name +"->") );



    }
}
