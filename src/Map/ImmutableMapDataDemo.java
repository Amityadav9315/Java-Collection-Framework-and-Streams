package Map;

import org.xml.sax.SAXNotRecognizedException;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDataDemo {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        Map<String,Integer> map2= Collections.unmodifiableMap(map1);
        System.out.println(map2);
       Map<String,Integer> map3=Map.of("sunham",98,"Vivek",99);
       map3.put("Akshita",88);
       Map<String,Integer> map4=Map.ofEntries(Map.entry("Akshita",99),Map.entry("Vivek",99));
    }
}
