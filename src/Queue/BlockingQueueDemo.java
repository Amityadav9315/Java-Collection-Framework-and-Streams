package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
   class Producer implements Runnable {
       private BlockingQueue<Integer> queue;
       private int value = 0;

       public Producer(BlockingQueue<Integer> queue) {
           this.queue = queue;

       }

       @Override
       public void run() {
           while (true) {
               try {

                   Integer value = queue.take();

                   System.out.println("Producer:" + value);
                   queue.put(value);
                   Thread.sleep(500);
               } catch (Exception ignored) {
                   Thread.currentThread().interrupt();
                   System.out.println("Producer interrupted");

               }

           }

       }

       public class BlockingQueueDemo {
           public static void main(String[] args) {
               BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);


           }
       }
   }
