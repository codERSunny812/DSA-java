package DataStructure.Stack;

/**
 * StackCreationUsingLL
 */
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


 class Stack {
        //Write your code here
        Node top;
        int size;

        Stack()
        {
            //Write your code here
            this.top = null;
            size = 0;
        }

        int getSize()
        {
            //Write your code here
            return size;

        }

        boolean isEmpty()
        {
            //Write your code here
            return top == null ;
        }

        void push(int data)
        {
            //Write your code here
            Node newNode = new Node(data);
            if(isEmpty()){
                top = newNode;
                size++;
            }else{
                newNode.next = top;
                top = newNode;
                size++;
            }
        }

        void pop()
        {
            //Write your code here
            if(!isEmpty()){
            top = top.next;
            size--;
            }
        }

        int getTop()
        {
            //Write your code here
            if(isEmpty()){
                return -1;
            }
            else{
                return top.data;
            }
        }
    }
public class StackCreationUsingLL {
  public static void main(String[] args) {
    
    Stack stack = new Stack();

    System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: Is the stack empty? true

    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println("Top element: " + stack.getTop()); // Output: Top element: 3

    stack.pop();
    System.out.println("Popped an element.");

    System.out.println("Stack size: " + stack.getSize()); // Output: Stack size: 2

    System.out.println("Top element: " + stack.getTop()); // Output: Top element: 2
  }
    
}