package Map;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
       // SortedMap<String, Integer>map = new TreeMap<>();

//        map.put("Mohit",91);
//        map.put("Amit",34);
//        map.put("Shayam",76);
//        System.out.println(map);
//
//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());

      SortedMap<Integer,String> navgableMap=new TreeMap<>();
      navgableMap.put(1,"One");
      navgableMap.put(2,"Two");
      navgableMap.put(5,"Five");
        System.out.println(navgableMap);



    }
}

