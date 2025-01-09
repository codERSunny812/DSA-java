package DataStructure.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("stack implementation in java");

        System.out.println("using the LL");

        StackUsingLL list = new StackUsingLL();
//        System.out.println(list);
        // Adding elements to the stack
        list.addElement(10);
        list.addElement(20);
        list.addElement(30);
        list.display(); // Output: Stack elements: 30 20 10


        // Peek at the top element
        System.out.println("Top element: " + list.peek()); // Output: Top element: 30

        // Remove an element
        System.out.println("Popped element: " + list.removeElement()); // Output: Popped element: 30

        // Display the stack
        list.display(); // Output: Stack elements: 20 10

        // Show size
        System.out.println("Size of stack: " + list.showSize()); // Output: Size of stack: 2

        // Check if the stack is empty
        System.out.println("Is stack empty? " + list.isEmpty()); // Output: Is stack empty? false

        // Remove all elements
        list.removeElement();
        list.removeElement();
        list.display(); // Output: Stack is empty.

        // Try to peek when stack is empty
        list.peek(); // Output: The stack is empty.
    }
}
