package CollectionFrameWork.ArrayList;

import java.util.List;

public class ArrayList {
    public static void main(String [] args){
        List<Integer> numbers = new ArrayList<>();

        // adding element in the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(2,34); //add at a specified index

        // accesing element 
        int firstNumber = numbers.get(0); // Access the first element (10)

        // updating the index
        numbers.set(1, 25); // Update the second element to 25

        // remove element from an array 
        numbers.remove(2); // Remove the third element (30)
       
        // size of an array list
        int size = numbers.size(); // Size of the ArrayList
       
        // Itrating throught the list
        for (int number : numbers) {
            System.out.println(number);
        }
    //  checking the arraylist is empty   or not         
    boolean isEmpty = numbers.isEmpty();
    
    //  clearing the list
    numbers.clear(); // Remove all elements


        
    }
}
