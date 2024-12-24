package Map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String ,Integer> map=new ConcurrentSkipListMap<>();
        map.put("Pomigeranate", 1);
        map.put("Mango",2);
        map.put("Orange",3);
        map.put("Nariyal",4);
        System.out.println(map) add ;
    }
}
