package CollectionFramwwork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

//        adding into the list

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("the item in the arraylist is:");

        System.out.println(list);

//        getting element from the list
        int item = list.get(1);

        System.out.println("the element at the index 1 of the list is:");
        System.out.println(item);


//        adding element in between


        list.add(2,7);

        System.out.println("the element at index 2 is:");
        System.out.println(list);


//        set element

        list.set(2,99);

        System.out.println("the element at the index 2 is:");
        System.out.println(list);


//        deleting element from the list
        list.remove(3);

        System.out.print("the size of the array is:");
        System.out.println(list.size());

        System.out.println("the element in the list are:");


//        iteration in arraylist
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        System.out.println("the element in the list after sorting is:");
        Collections.sort(list);
        System.out.print(list);

    }
}
