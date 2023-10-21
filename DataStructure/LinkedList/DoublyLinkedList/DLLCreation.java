package DataStructure.LinkedList.DoublyLinkedList;

class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLLCreation {
    public static void main(String[] args) {
        System.out.println("we have to create a DLL with 5 node");
        Node n1 = new Node(10);
        // create a node head
        Node head = n1;
        head.prev = null;
        head.next = null;
        
        // now create a new node 2
        
        Node n2 = new Node(20);
        head.next = n2;
        n2.prev = head;
        n2.next = null;
        
        
        
        // now create a node 3
        
        
         Node n3 = new Node(30);
        n2.next = n3;
        n3.prev = n2;
        n3.next = null;

        // now create a node 4
        
        
         Node n4 = new Node(40);
        n3.next = n4;
        n4.prev = n3;
        n4.next = null;


        // now create a node 5
        
        
         Node n5 = new Node(50);
        n4.next = n5;
        n5.prev = n4;
        n5.next = null;

        // now lets traverse the array from the starting  of the DLL
        Node newNodeFromStart = head;
        System.out.println("Lets print the linked list from the start");
        while(newNodeFromStart != null){
            System.out.print(newNodeFromStart.data+ "-->");
            newNodeFromStart= newNodeFromStart.next;
        }
        System.out.println("NULL");


    //    now lets traverse the DLL from the end 

        Node newNodeFromStart2 = n5;
        System.out.println("Lets print the linked list from the end");
        while(newNodeFromStart2 != null){
            System.out.print(newNodeFromStart2.data+ "-->");
            newNodeFromStart2= newNodeFromStart2.prev;
        }
        System.out.println("NULL");
    }

}
