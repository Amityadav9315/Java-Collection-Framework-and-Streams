package Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue();
        pq.add(34);
        pq.add(54);
        pq.add(67);
        pq.add(98);
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
