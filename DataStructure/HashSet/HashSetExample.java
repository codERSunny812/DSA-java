package DataStructure.HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
         // Instantiate an object of HashSet 
         HashSet<Integer> set = new HashSet<>();

         //adding element to the hashset
         set.add(1);
         set.add(2);
         set.add(3);
         set.add(4);
         set.add(8);
         set.add(9);
         set.add(1); //dublicate element are not allowed

        //  printing the elements
        System.out.println(set);

        // size of set
        System.out.println(set.size());

        // search element

        if(set.contains(7)){
            System.out.println("the element is present");
        }
        if(!set.contains(7)){
            System.out.println("the element is not present");
        }

        // remove element
        set.remove(4);

        System.out.println(set);



        System.out.println("itration throught itrators");
        // itrators in set
        // the element are not contigous so we cant itratre using normal loop,so we need itrators to traverse the set
        Iterator<Integer> it = set.iterator();
      /*
       * 
        it provide two function for the itration 
        1. hasnext()
        2. next()

       Where hasNext() method check whether HashSet has elements or not and, Next() method access the data of HashSet.
       */
       
       while(it.hasNext()){
        System.out.print(it.next()+ " ");
       }
        
       System.out.println(" ");
        
        // to clear all the element
        set.clear();
        System.out.println(set);


    }
}
