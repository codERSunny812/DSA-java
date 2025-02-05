package Recursion.Strings;

public class SkipCharacters {
    static String skipCharacter( String newStr,String str ){
        //base case
        if(str.isEmpty()){
            return  newStr;
        }

        char ch = str.charAt(1);

        if(ch == 'o'){
            return skipCharacter(newStr ,str.substring(1) );
        }

        return skipCharacter(newStr+ch , str.substring(1));
    }
    public static void main(String[] args) {
        String str = "noeoyomoaor";
        String removed = "";
        String st = skipCharacter(removed , str);
        System.out.println(st);
    }
}
