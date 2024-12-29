package DataStructure.LL;

public class DoublyLinkedList {
    private Node head;
    private int size ;
    private  Node tail;

    public DoublyLinkedList(){
        this.size=0;
    }

    private class Node{
        private int data;
        private Node next;
        private  Node prev;


        public Node(int data){
            this.data=data;
        }

        public Node(int data,Node next,Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }


    //function to add data in the start of a DLL
    public void addDataToTheStart(int data){
        Node newNode = new Node(data);

        newNode.next=head;
        newNode.prev=null;
        if(head != null){
            head.prev=newNode;
        }
        head = newNode;
        if(tail == null){
            tail=head;
        }

        size++;

    }

    public void addDataAtTheEnd(int data){
        Node newNode = new Node(data);
//        check the list is not empty

        if(head == null){
           addDataToTheStart(data);
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        size++;

    }

    public void addElementAtAnIndex(int data, int index){
        Node newNode = new Node(data);
        //boundary check
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        // General case: Insert in the middle
        Node temp = head;
        for (int i = 0; i < index - 1; i++) { // Move temp to index - 1
            temp = temp.next;
        }

        // Update pointers to insert the new node
        newNode.next = temp.next;  // Link newNode to the next node
        newNode.prev = temp;       // Link newNode to the previous node

        //avoid null pointer exception
        if (temp.next != null) {
            temp.next.prev = newNode; // Update the previous pointer of the next node
        }

        temp.next = newNode;       // Update the next pointer of temp

        size++;
    }


//    function to add display the DLL
    public void printDLL(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("end");
    }

//function to print in reverse
    public void printDllInReverse(){
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.prev;
        }
        System.out.println("END");
    }


}
