package BasicMath;

public class UniqueElement {
    static int findUnique(int [] array){
        int unique = 0;
        for(int num : array){
            unique ^= num;
        }

        return unique;

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1,5,3};
        int ele = findUnique(arr);
        System.out.println(ele);

        float a = 1.3431f;
        System.out.printf("%.3f",a);
    }
}
