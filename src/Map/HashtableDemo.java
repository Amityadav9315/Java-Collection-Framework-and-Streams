package Map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(1,"apple");
        hashtable.put(2, "Banana");
        hashtable.put(3,"cherry");
        System.out.println(hashtable);
        System.out.println("Value for key 2:" + hashtable.get(2));
        System.out.println("Does key 3 exist:"+ hashtable.containsKey(3));
        hashtable.remove(1);
        System.out.println("Afer removing onr "+ hashtable);

        HashMap<Integer,String> map=new HashMap<>();
        Thread thread1=new Thread(() ->{
            for(int i=0; i<1000; i++) {
                map.put(i,"Thread1");
            }
        });
        Thread thread2=new Thread(() ->{
            for(int i=0; i<1000; i++) {
                map.put(i,"Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch(InterruptedException e){
            e.printStackTrace();

        }
        System.out.println("Final sixe i=of HashMap"+ map.size());




    }
}
