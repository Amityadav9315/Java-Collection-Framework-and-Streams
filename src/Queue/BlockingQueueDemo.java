package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
   class Producer implements Runnable{
       private  BlockingQueue<Integer> queue;
       private int value=0;

       public Producer(BlockingQueue<Integer>queue){
           this.queue=queue;

       }
       @Override
       public void run(){

       }

   }
public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<>(5);


    }
}
