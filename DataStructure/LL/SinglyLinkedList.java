package DataStructure.LL;

//singly linked list creation in java
public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    //node creation
   private class Node{
//        variable of the node
       private int data;
       private Node next;


//       parameterised constructur
        public Node(int data){
            this.data=data;
        }

        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

    }
//    constructure function
    public SinglyLinkedList(){
        this.size=0;
    }

//    function to add element at the first of the list
    public void addToTheFirst(int data){

       //node creation for the element
        Node newNode = new Node(data);

        newNode.next=head; //link the current node to the current head
        head=newNode;     //update the head to point to the new node

        //tail also
        if(tail==null){
            tail=head;
        }

        size++;
    }


//    add element at the end
    public void addToTheEnd(int data){

       //create a new node for the element
        Node newNode = new Node(data);

       //check if the list empty or not
        if(head == null){
            addToTheFirst(data);
            return;
        }

        tail.next=newNode;
        tail=newNode;
        size++;
    }

//    display the element
    public void displayTheList(){
       //check the list is empty or not
        if(head == null){
            System.out.println("the list is empty");
            return;
        }

        Node temp=head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }

//    add the element at a certain index
    public void addElementAtIndex(int data , int index){

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }


        if(head == null){
             addToTheFirst(data);
         }
        //check for the index
        if (index == 0){
            addToTheFirst(data);
        }

        if(index == size){
            addToTheEnd(data);
        }

        Node temp = head; //initally we are at 0 index
        for(int i=1;i<index;i++){ //loop is started from 1
            temp=temp.next; //loop will stop at index-1
        }

        Node newNode = new Node(data,temp.next);

        temp.next = newNode;
        size++;


    }


//    deletion in the list from the start
    public  void deleteFromTheStart(){
//       checking the list is empty or not
        if(head == null){
            System.out.println("the list is already empty");
            return;
        }

        int value = head.data;
        System.out.println("the deleted data is: "+value);

        head = head.next; //passing the reference to head to it's next element
        //check if head is became null
        if(head == null){
            tail=null;
        }
        size--;
    }


    public void deleteFromTheEnd(){

        // Check if the list is empty
        if (head == null) {
            System.out.println("The list is already empty");
            return;
        }
        // If there's only one element, delete the head and reset tail
        if (head == tail) {
            System.out.println("The deleted data is: " + head.data);
            head = null;
            tail = null;
            size--;
            return;
        }

       Node secondLast = get(size-2);
       tail=secondLast;
       tail.next=null;
    }

    //function to reach at any index in LL
    public Node get(int index){

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
       Node temp = head;
       for(int i=1;i<=index;i++){
           temp=temp.next;
       }
       return  temp;

    }


//    function to delete from a specific index of the list
    public void deleteFromAnIndex(int index){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if(index == 0){
            deleteFromTheStart();
            return;
        }
        if(index == size){
            deleteFromTheEnd();
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        temp.next = temp.next.next;
        size--;


    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Singly Linked list creation in java");

            SinglyLinkedList list = new SinglyLinkedList(); //object created of the custom class
            list.addToTheFirst(12);
            list.addToTheFirst(13);
            list.addToTheFirst(14);
            list.addToTheFirst(15);
            list.addToTheFirst(16);
            list.addToTheFirst(17);
            list.addToTheFirst(18);
            list.addToTheFirst(19);
            list.addToTheFirst(20);
            list.displayTheList();
            list.addToTheEnd(21);
            list.addToTheEnd(22);
            list.addToTheEnd(23);
            list.addToTheEnd(24);
            list.displayTheList();
            list.addElementAtIndex(999,4);
            list.displayTheList();
            list.deleteFromTheStart();
            list.displayTheList();
            list.deleteFromTheEnd();
            list.displayTheList();
            list.deleteFromAnIndex(2);
            list.displayTheList();


            System.out.println("doubly linked list:");

            DoublyLinkedList list2 = new DoublyLinkedList();
            list2.addDataToTheStart(4);
            list2.addDataToTheStart(3);
            list2.addDataToTheStart(2);
            list2.addDataToTheStart(1);
            list2.addDataAtTheEnd(5);
            list2.addDataAtTheEnd(6);


            list2.printDLL();
            System.out.println("DLL in reverse  order");
            list2.printDllInReverse();

            list2.addElementAtAnIndex(45,3);

            list2.printDLL();


            System.out.println("circular linked list");

            CircularLinkedList list3= new CircularLinkedList();

    //        list3.printCLL();

            list3.addFirst(1);
            list3.addFirst(2);
            list3.addFirst(3);
            list3.printCLL();
            list3.addToTheEnd(4);
            list3.addToTheEnd(5);
            list3.printCLL();
            System.out.println(list3.isCircular());




        }
    }
}
