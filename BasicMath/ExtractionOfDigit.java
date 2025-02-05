package BasicMath;

public class ExtractionOfDigit {
    public static void main(String[] args) {
        int  number = 7784; //user's input

        int []arr=new int [4]; //array of size 4
        int i=0;


        while(number>0){
            int lastDigit = number % 10;
            arr[i]=lastDigit;
            i++;
            number=number/10;
        }

        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
