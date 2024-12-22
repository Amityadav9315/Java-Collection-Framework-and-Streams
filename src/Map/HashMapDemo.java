package Map;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Akshita");
        map.put(2,"Neha");
        map.put(3,"Shubham");

        System.out.println(map);
        String student=map.get(3);
        System.out.println(student);

    }
}
