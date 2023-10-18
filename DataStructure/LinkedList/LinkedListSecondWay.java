package DataStructure.LinkedList;

class Node{
    int num;
    Node next;
    Node(int num ){
        this.num = num;
        this.next=null;
    }


}

public class LinkedListSecondWay {
    public static void  main(String []args){
    Node newNode1 = new Node(100);
    Node newNode2 = new Node(200);
    Node newNode3 = new Node(300);
    Node head = newNode1;
    newNode1.next= newNode2;
    newNode2.next= newNode3;
    newNode3.next = null;

    // now traverse the list to print the  values of the list 

    Node currentNode = head;
    while(currentNode!=null){
        System.out.print(currentNode.num + "-->");
        currentNode=currentNode.next;
    }
    System.out.println("NULL");

    }
}
