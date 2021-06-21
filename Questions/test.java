import java.util.*;

public class test {

    public static void main(String[] args) {

        TwoStackQueue myQueue = new TwoStackQueue();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(10);
        myQueue.enqueue(7);
        myQueue.enqueue(6);
        myQueue.enqueue(-12);

        System.out.println(myQueue.dequeue() + " " + myQueue.dequeue() + " " + myQueue.dequeue() + " "
                + myQueue.dequeue() + " " + myQueue.peek() + " " + myQueue.dequeue());

    }
}