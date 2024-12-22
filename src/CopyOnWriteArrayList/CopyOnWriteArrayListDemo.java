package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        List<String> shoppinglist=new ArrayList<>();
        shoppinglist.add("Milk");
        shoppinglist.add("egg");
        shoppinglist.add("Butter");
        shoppinglist.add("Bread");
        System.out.println("initial shopping list"+ shoppinglist);
        for(String item:shoppinglist){
            System.out.println(item);
            //try to modify shopping list while reading
            if(item.equals("Egg")){
                shoppinglist.add("Jam");
                System.out.println("Add cutter while reading");
            }
        }


    }
}
