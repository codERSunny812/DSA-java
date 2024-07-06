package Recursion;

public class isSortedArray {



    static  void checkArrayIsSorted(int []arr){
        int i=0;

        int lenght = arr.length;
        //base case
        if(i>lenght){
            System.out.println("sorted");
        }

//        check for the array

        if(arr[i]>arr[i+1]){
            System.out.println("not sorted");
        }
        i=i+1;


        checkArrayIsSorted(arr);
    }
    public static void main(String[] args) {
        //check that the array is sorted or not.

        int [] arr = {1,2,3,4,5};

        int length = arr.length;

        checkArrayIsSorted(arr);
    }
}
