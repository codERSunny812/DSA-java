package DataStructure.Stack;

public class CreationOfStack {
    public static void main(String[] args) {
        
    static class Stack {
        int []a;
        int top;
        int capacity;
        Stack(int capacity) {
            // Write your code here.
            this.capacity = capacity;
            top = -1;
            a = new int[capacity];

        }
        public void push(int num) {
            
            if(top != capacity-1){
                top++;
                a[top]=num;
            }
        }
        public int pop() {
            // Write your code here.
            if(top == -1){
               return -1;

            }
            int res = a[top];
            top--;
           return res;
        }
        public int top() {
            // Write your code here.
            if(top == -1){
                return -1;
            }
            int upperElement = a[top];
            return upperElement;

        }
        public int isEmpty() {
            // Write your code here.
            if(top == -1){
               return 1; 
            }
            return 0;
        }
        public int isFull() {
            // Write your code here.
            if(top == capacity -1){
           return 1;
            }
            return 0;
        }
    }
    }
}
