import DataStructure.LL.CircularLinkedList;
import DataStructure.LL.DoublyLinkedList;
import DataStructure.LL.SinglyLinkedList;

public class Main {
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