package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true);
        // linkedHashMap<String,Integer> hashMap=new HashMap<>();
        linkedHashMap.put("orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);
        linkedHashMap.get("Apple");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        hashMap.put("Shubham", 91);
        hashMap.put("Bob",88);
        hashMap.put("Akshit",78);

        Integer res=hashMap.getOrDefault("vipul",0);
        System.out.println(res);


    }
}