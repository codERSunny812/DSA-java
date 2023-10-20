package DataStructure.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
// creation  of the linked list 
class LinkedListClass{
    public Node HEAD;

   public  LinkedListClass(){
        HEAD = null; //constructor created
        //initially the head is null coz we are creating the linked list 
    }

    // now add element in the linked list
    public void add(int data) {
        Node newNode = new Node(data);

        // now check that the head is empty  or not
        if (HEAD == null) {
            HEAD = newNode;
            return;
        }
        Node currentNode = HEAD;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        
        currentNode.next = newNode;
        
    }


    // Method to display the linked list
    public void display() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }






}

public class LinkedListLearning {
    public static void main(String[] args) {
        // object is created of the linked list class
        LinkedListClass newList = new LinkedListClass();
        //add element to the linked list
        newList.add(10);
        newList.add(20);
        newList.add(30);

          // Display the linked list
          System.out.print("Linked List: ");
          newList.display();
    }
}
