package DataStructure.LinkedList;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListCreation{
Node head;

// we have created a head and mark it as null
public LinkedListCreation(){
    head = null;
}

// function to add element in the linked list 
 public void add(int data){
    Node newNode = new Node(data);

    if(head ==  null){
        head = newNode;
    }else{
        Node ntn = head;
        while(ntn.next != null){
            ntn=ntn.next;
        }
        ntn.next= newNode;
    }

 }


//  function to display the element of the linked list 
public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


// now let's create a function which add the element passed as an argment to it in the first of the linked list

public void addFirst(int data){
    // crate a node for the given data 
    Node nayaNode = new Node(data);

    // check if the given LL is empty or not 
    if(head == null){
        head = nayaNode;
    }else{
        nayaNode.next = head;
        head = nayaNode;
    }

}



}


public class AddAtTheFirst {
    public static void main(String [] args){
        // created a new Linked list 
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


        // now lets add element at the first of the linked list 
        newList.addFirst(100);

        System.out.println("so the value of the linked list after adding an element to the starting  of the LL is");
        newList.display();
    
    }
}
