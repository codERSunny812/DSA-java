package PatternInJava;

public class Pattern2 {
    public static void main(String[] args) {
//      hollow rectangle
        int m=4;
        int n =4;
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==1 || j== 1 || i== m || j==n){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}
