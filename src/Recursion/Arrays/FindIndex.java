package Recursion.Arrays;

import java.util.ArrayList;

public class FindIndex {
    static int findFirst(int []arr , int index , int target){
        //base condition
        if(index == arr.length){
            return -1;
        }

        if(target == arr[index]){
            return index;
        }

        return findFirst(arr , index+1, target);
    }

    static ArrayList<Integer> findAllIndex(int [] arr, int index , int target , ArrayList<Integer> list ){
        if(index == arr.length)
        {
            return list;
        }

        if(target == arr[index]){
            list.add(index);
        }

        return findAllIndex(arr , index+1 , target , list);
    }
    public static void main(String[] args) {;
        int [] arr = {1,2,3,4,4,6,7,8,4};
        //find the first occurance of the target 4
        System.out.println(findFirst(arr,0,4));
        //find all the index of the target from the array
        ArrayList<Integer> list = new ArrayList<>();
        list = findAllIndex(arr , 0 , 4 , new ArrayList<Integer>());
        System.out.println(list);
    }
}
