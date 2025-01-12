package DataStructure.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("stack implementation in java");

        System.out.println("1. using java");

        StackUsingArray list = new StackUsingArray(8);

        //addition in stack
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(20);
        list.add(22);
        list.add(24);
        list.add(26);

        //top element in the stack
        System.out.println("the top element in the stack is:"+list.peek());

        //trying to add one more  element in the stack
        list.add(28); //getting an erorr of stack is full

        //removing element from the array






    }
}
