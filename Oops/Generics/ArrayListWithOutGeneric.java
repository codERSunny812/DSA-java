package Oops.Generics;

import java.util.ArrayList;

public class ArrayListWithOutGeneric {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();//no type is specified
        list1.add("hello");
        list1.add(12); //allowed but  not type safed

        //retreving element
        String str = (String) list1.get(0); // Casting is required
        System.out.println(str);

         int str2 = (int) list1.get(1);
        System.out.println(str2);


        // This would cause a runtime error:
        // String str2 = (String) list.get(1);


        ArrayList<String> list = new ArrayList<>(); // Specify type as String
        list.add("Hello");
        // list.add(10); // Compilation error: Type mismatch

        // Retrieving elements
        String str1 = list.get(0); // No casting required
        System.out.println(str);



    }
}
