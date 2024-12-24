package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {



        private int capacity;

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public LRUCache(int capacity){
            super(capacity,0.75f,true);
            this.capacity=capacity;


    }
       public static  void main(String[] args){
            LRUCache<String ,Integer> studentMap= new LRUCache<>(3);
            studentMap.put("Bob",30);
            studentMap.put("Alice",89);
            studentMap.put("Ram",54);
            studentMap.put("Vipul",65);
           System.out.println(studentMap);
       }
}
