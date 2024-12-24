package Map;

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



    }
}
