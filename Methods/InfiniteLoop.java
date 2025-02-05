package Methods;

public class InfiniteLoop {
    public static void loop(){
        do{
            System.out.println("hello");
        }while(true);
    }
    public static void main(String[] args) {
        System.out.println("infinite loop");

        loop();
    }
}
