package DataStructure.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReverseLLFromTheMiddle {
    public static void main(String[] args) {
        
        System.out.println("LL creation");
        Node n1 = new Node(10);
        Node head = n1;
        Node n2 = new Node(20);
        head.next = n2;
        n2.next = null;
        Node n3 = new Node(30);
        n2.next = n3;
        n3.next = null;
        Node n4 = new Node(40);
        n3.next = n4;
        n4.next = null;
         Node n5 = new Node(50);
        n4.next = n5;
        n5.next = null;
        Node n6 = new Node(60);
        n5.next = n6;
        n6.next = null;
        Node n7 = new Node(70);
        n6.next = n7;
        n7.next = null;
        
        System.out.println("the traverse of the LL is ");
        
        Node newNode = head;
        while(newNode != null){
            System.out.print(newNode.data + "-->");
            newNode = newNode.next;
        }
        System.out.println("NULL");
        System.out.println(" ");
        
        System.out.println("The lenght of the LL is ");
        int length = 0;
        Node curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        System.out.println(length);
        System.out.println(" ");
        
        System.out.println("the middle of the linked list is :");
        
        Node slow = head;
        Node fast = head;
        // int middleNodeValue = 1;
        while(fast != null && fast.next!= null){
            // middleNodeValue++;
           slow = slow.next;
          fast = fast.next.next;
        }
        // slow.next = null;
        System.out.println(slow.data);
        
        
        // now let's reverse the list from the middle 
        Node prev = null;
        Node curr1 = slow.next;
        Node nextNode ;
        
        while(curr1 != null){
            nextNode = curr1.next;
            curr1.next = prev;
            prev = curr1;
            curr1 = nextNode;
        }
        
        
        // Connect the reversed list back to the original list
        slow.next = prev;

        System.out.println("Reversed Linked List:");

        Node reversedNode = head;
        while (reversedNode != null) {
            System.out.print(reversedNode.data + "-->");
            reversedNode = reversedNode.next;
        }
        System.out.println("NULL");

    }
}
