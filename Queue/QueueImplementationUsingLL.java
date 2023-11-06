package Queue;

 class Node {
        public int data;
        public Node next;
   
        Node()
        {
            this.data = 0;
            this.next = null;
        }
   
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
   
        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    };
   
    class Queue extends Node{
        Node front;
        Node rear;
        void push(){};
        Queue() {
            front = null;
            rear = null;
        }
    }

public class QueueImplementationUsingLL  extends Queue{

    public static void main(String[] args) {


        Node push(int x) {
            // Write Your Code Here
            Node newNode = new Node(x);
    
            if(front == null){
                front = rear = newNode;
                return;
            }
    
            rear.next = newNode;
            rear = newNode;
            return front;
        }

        public int pop() {
            // Write Your Code Here
            if(front == null){
                return -1;
            }
            int result = front.data;
            front = front.next;
            return result;
        }
    }
}
