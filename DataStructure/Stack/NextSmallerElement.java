package DataStructure.Stack;

import java.util.Stack;

public class NextSmallerElement {
    public static int [] nextSmaller(int[] arr){
        int n  = arr.length;
    
        Stack<Integer> s = new Stack<>();
        int [] array = new int[n];
        int j =0;
        for(int i=n-1;i>=0;i--){
            
            while(!s.isEmpty() && s.peek() >= arr[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                array[j]=-1;
                j++;
            }else{
               array[j]=s.peek();
               j++;
            }
            s.push(arr[i]);
        }
        
        
        // now we have got the array so lets reverse that 
        int length = array.length;
        int start = 0;
        int end = length -1;
        
        while(start <= end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
        
    }
    public static void main(String[] args) {
        // int[] arr = {4, 2, 1, 5, 3};
        int[] arr = {5,6,2,3,1,7};
    int[] result = nextSmaller(arr);

    System.out.println("Next Smaller Elements:");
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
    }

    }
}
