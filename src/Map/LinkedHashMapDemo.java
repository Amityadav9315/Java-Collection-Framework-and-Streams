package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer> linkedHashMap=new LinkedHashMap<>();
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("orange",10);
        hashMap.put("Apple",20);
        hashMap.put("Guava",13);
        for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }


    }
}
