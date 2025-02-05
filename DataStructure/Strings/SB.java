package DataStructure.Strings;

import java.util.ArrayList;

public class SB {
    public static void main(String[] args) {
        System.out.println("String builder in java");
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
//        str.append(1);
//        System.out.println(str); //hello1
//        str.append(new ArrayList<>());
//        System.out.println(str); //hello[]
        str.append(" world ");
        System.out.println(str);
        str.append(" how are you buddy ");
        System.out.println(str);
        str.insert(11,',');
        System.out.println(str);
        str.delete(2,6);
        System.out.println(str);
        str.deleteCharAt(9);
        System.out.println(str);

        str.reverse();
        System.out.println(str);

    }
}
