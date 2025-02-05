package DataStructure.Array;

import java.util.Arrays;

public class Array {

    public static void CalMin(int [] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        System.out.println("arrays in java");

        System.out.println("1. one dimensional array");
        //decleration
        int[] arr1;      // Declares an array of integers
        String[] names; // Declares an array of Strings

        //allocation/initilisation
        arr1 = new int[5]; // Creates an array of size 5

//        combined decleration and initilisation
        int[] arr = new int[5]; // Declares and allocates memory for an array of size 5

//        initilisation with values
        int[] arr2 = {10, 20, 30, 40, 50}; // Array with 5 elements

//        accessing element of array
        int[] arr3 = {10, 20, 30, 40, 50};
        System.out.println(arr3[0]); // Access first element (Output: 10)
        arr3[1] = 25;               // Modify second element
        System.out.println(arr3[1]); // Output: 25

        //array decleration and initilisation
        int [] newArr = new int[7];

        //loop to fill the array
        for(int i=0;i<newArr.length;i++){
            newArr[i]=i+21;
        }

        //itration over the array
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();


//        using for each loop to print the array
        for(int num:newArr){
            System.out.print(num+"->");
        }

        System.out.println();
        System.out.println(newArr);

//        it will give the string represntation of an array
        System.out.println(Arrays.toString(newArr));

//        passing array to a method in java
        int [] arr4 = {121,9,120,1111};
        CalMin(arr4);


        System.out.println("2. two dimensional array");

        int[][] arr5 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(arr5[0][2]);


        int [][] array = new int[3][3]; //2 d array of 3 row and 3  column

        //filling the 2 array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=j+2;
            }
        }

//        display the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

//        if we only know the row of the array

        int [] [] array1 = new int[6][]; //6 row in the  array

        System.out.println(array1.length); //6 ==> no of rows
        //filling the array

        // Initialize each row with different column sizes
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new int[i + 1]; // Row i has i+1 columns
        }

        // Fill the array with values
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = i + j; // Fill each element with i+j
            }
        }

        // Print the array
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }










    }
}
