package DataStructure.Stack;

public  class StackUsingLL {
    private Node top; // Top of the stack
    private int size; // Size of the stack

    // Constructor
    public StackUsingLL() {
        this.top = null; // Initially, the stack is empty
        this.size = 0;   // Size is 0
    }

    // Inner Node class
    class Node {
        int data;
        Node next;

        // Constructor for Node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to add an element to the stack
    public void addElement(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = top;           // Link the new node to the current top
        top = newNode;                // Update the top to the new node
        size++;                       // Increment the size
    }

    // Function to remove an element from the stack
    public int removeElement() {
        // Check if the stack is empty
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return -1;
        }
        int poppedElement = top.data; // Get the data from the top node
        top = top.next;               // Update top to the next node
        size--;                       // Decrement the size
        return poppedElement;         // Return the popped element
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return top == null; // If top is null, the stack is empty
    }

    // Function to get the size of the stack
    public int showSize() {
        return size; // Return the size
    }

    // Function to peek at the top element without removing it
    public int peek() {
        if (isEmpty()) { // Check if the stack is empty
            System.out.println("The stack is empty.");
            return -1;
        }
        return top.data; // Return the top element
    }

    // Function to display all elements in the stack
    public void display() {
        if (isEmpty()) { // Check if the stack is empty
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top; // Start from the top
        System.out.print("Stack elements: ");
        while (current != null) { // Traverse the stack
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
