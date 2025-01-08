package Oops.Generics;

public class CustomArrayList {
    private int[] elements; // Internal array to store elements
    private int size = 0;   // Number of elements in the list
    private static final int DEFAULT_CAPACITY = 10; // Default initial capacity

    // Constructor
    public CustomArrayList() {
        this.elements = new int[DEFAULT_CAPACITY]; // Initialize array with default size
    }

    // Add an element to the list
    public void add(int data) {
        if (isFull()) {
            resize(); // Increase capacity if full
        }
        elements[size++] = data;
    }

    // Check if the internal array is full
    public boolean isFull() {
        return elements.length == size;
    }

    // Resize the internal array to double its current capacity
    public void resize() {
        int[] temp = new int[elements.length * 2];
        // Copy all elements to the new array
        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }
        elements = temp;
    }

    // Get an element by index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        return elements[index];
    }

    // Get the current size of the list
    public int size() {
        return size;
    }

    // Remove an element by index
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        int removedElement = elements[index];
        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = 0; // Clear the last element
        return removedElement;
    }

    // Display the elements as a string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List: " + list); // Output: [10, 20, 30]

        // Get an element
        System.out.println("Element at index 1: " + list.get(1)); // Output: 20

        // Remove an element
        list.remove(1);
        System.out.println("After removing index 1: " + list); // Output: [10, 30]

        // Add more elements
        list.add(40);
        list.add(50);
        System.out.println("After adding more elements: " + list); // Output: [10, 30, 40, 50]

        // Get the size
        System.out.println("Size: " + list.size()); // Output: 4
    }
}
