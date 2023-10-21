package DataStructure.LinkedList.DoublyLinkedList;

public class DLLUsingArray {

  public   class Node {
        public int data;
        public Node next;
        public Node prev;

        Node() {
            this.data = 0;
            this.next = null;
            this.prev = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public Node constructDLL(int[] arr) {
        // Write your code here
        Node newNode = new Node(arr[0]);
        Node head = newNode;
        head.next = null;
        head.prev = null;

        Node current = head;

        // now let's add more nodes to the list
        for (int i = 1; i < arr.length; i++) {
            Node nayaNode = new Node(arr[i]);
            current.next = nayaNode;
            nayaNode.prev = current;
            nayaNode.next = null;
            current = nayaNode;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        DLLUsingArray dll = new DLLUsingArray(); // Create an instance of the class
        Node head = dll.constructDLL(arr);

        System.out.println("Lets print the DLL");
        
        Node currentNode = head;
         
        System.out.println(" ");
        while(currentNode != null){
            System.out.print(currentNode.data+ "-->");
            currentNode=currentNode.next;

        }
        System.out.println("This is the end of the DLL");

        // You can now work with the doubly linked list
    }
}
