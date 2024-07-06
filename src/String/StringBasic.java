package String;

public class StringBasic {
    public static void main(String[] args) {
        //sequence of characters

//        String name = "sunny";
//        System.out.println(name);
//
//        //an array of character is same as String.
//
////        there are two ways to create a string
//
//        String newName = new String("sushil pandey");
//
//        System.out.println(newName);


//        more about string

//        String val1 = "hey";
//        String val2 = "hey";
//
//        System.out.println(val1);
//        System.out.println(val2);
//
//        val1 = "hello bhai ki haal chal";
        // a new string is formed in the heap memory and the value 1 will point to that value




//        System.out.println(val1);
//        System.out.println(val2);



//
//        String val = "hello ji";
//        String val3 = val;
//
//        System.out.println(val == val3) ;
//
//        val = "yoahh";
//
//        System.out.println(val == val3) ;


//        strings methods

        String str = "hello buddy my name is sunny!";

        System.out.println(str.charAt(9));
        System.out.println(str.length());
        System.out.println(str.substring(9));
        System.out.println(str.substring(2,12));


        String name1 = "sunny";
        String name2 = new String("sunny");

        System.out.println(name1.equals(name2));

    }
}
