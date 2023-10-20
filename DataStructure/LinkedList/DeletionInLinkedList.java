package DataStructure.LinkedList;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListCreation {
    Node head;

    // we have created a head and mark it as null
    public LinkedListCreation() {
        head = null;
    }

    // function to add element in the linked list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node ntn = head;
            while (ntn.next != null) {
                ntn = ntn.next;
            }
            ntn.next = newNode;
        }

    }

    // function to display the element of the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteFromEnd() {
    // Check if the list is empty
    if (head == null) {
        System.out.println("Sorry, the list is empty.");
        return;
    }

    // Check if there's only one element in the list
    if (head.next == null) {
        head = null;
        return;
    }

    // Now traverse the list and find the end of the list 
    Node curr = head;
    while (curr.next.next != null) {
        curr = curr.next;
    }
    curr.next = null;
}







    
    }

public class DeletionInLinkedList {

    public static void main(String[] args) {
        LinkedListCreation newList = new LinkedListCreation();

     // now lets add some element to the linked list


    System.out.println("lets add element to the linked list ");
     newList.add(10);
     newList.add(20);
     newList.add(30);
     newList.add(40);
     newList.add(50);
    System.out.println("now lets print the values of the linked list ");
     newList.display();

    System.out.println("Now let's delete the element from the end ");
    newList.deleteFromEnd();
    newList.display();

    }
}
