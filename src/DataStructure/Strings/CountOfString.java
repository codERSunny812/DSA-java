package DataStructure.Strings;

public class CountOfString {
    public static void main(String[] args) {
        String str = "hey i am sunny";
        int [] arr = new int[26];
        //array is filled
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }

        System.out.println("array content is:");
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i]+"->");
        }
        System.out.println();
    }
}
