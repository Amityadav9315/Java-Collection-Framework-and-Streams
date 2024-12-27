package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(34);
        queue.add(76);
        queue.add(98);
        queue.add(90);
        System.out.println(queue);

    }
}
