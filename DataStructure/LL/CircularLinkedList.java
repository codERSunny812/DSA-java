package DataStructure.LL;



public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    class Node{
        private int data;
        private  Node next;


        private  Node(int data){
        this.data=data;
        }

        private Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

    }



    public   CircularLinkedList(){
        this.size=0;
    }


//    function to add element to the start of the CLL
    public void addFirst(int data){
        Node newNode = new Node(data);

      if(head == null) {
          head=newNode;
          tail=newNode;
          tail.next=head;
          size++;
          return;
      }

      tail.next=newNode;
      newNode.next=head;
      head = newNode;
        size++;

    }


//    function to add element at the end
     public void addToTheEnd(int data){

        Node newNode = new Node(data);
        //check for the list
         if(head==null){
             addFirst(data);
             return;
         }


         tail.next=newNode;
         newNode.next=head;
         tail=newNode;
         size++;

     }

    // Function to print the CLL
    public void printCLL() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }



//    check list is circular

    public boolean isCircular(){
        if(head == null) return  false;
        return  tail != null && tail.next == head;
    }


}
