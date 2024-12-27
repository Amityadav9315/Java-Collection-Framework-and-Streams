package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(34);
        deque.addLast(65);
        deque.addFirst(45);
        deque.addLast(87);
        deque.removeFirst();
        System.out.println(deque);


    }
}
