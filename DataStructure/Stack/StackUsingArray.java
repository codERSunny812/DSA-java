package DataStructure.Stack;

public class StackUsingArray {
    private int [] stack; //array to store the stack element
    private int  capacity; //size of the stack
    private int top; //pointer to point to the top of the stack

    public StackUsingArray(int data){
        capacity=data;
        top=-1;
        stack = new int[data];
    }

    //functions in stack
//    1. addition in the stack

    public void add(int data){
        //check the stack
        if(top == capacity-1){
            System.out.println("the stack is full");
            return;
        }

        top++;
        stack[top]=data;
    }

//   2.  pop operation in stack
    public int pop(){
        //check the array
        if(top == -1){
            System.out.println("the stack is empty");
            return -1;
        }

        int element = stack[top];
        top--;
        return element;
    }

    //3. peek operation in stack
    public int peek(){
        return stack[top];
    }

    //4. is empty
    public boolean isEmpty(){
        return top == -1;
    }

//    5. size of the stack
    public int size(){
        return capacity;
    }
}
