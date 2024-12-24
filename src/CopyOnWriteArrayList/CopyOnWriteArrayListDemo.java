package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        List<String> shoppinglist=new CopyOnWriteArrayList<>();
        shoppinglist.add("Milk");
        shoppinglist.add("egg");
        shoppinglist.add("Bread");
       // shoppinglist.add("Bread"); df
        System.out.println();
        System.out.println("initial shopping list"+ shoppinglist);
        for(String item:shoppinglist){
            System.out.println(item);
            //try to modify shopping list while reading
            if(item.equals("egg")){
                shoppinglist.add("Jam");
                System.out.println("Add jam while reading");
            }
        }
        System.out.println("Updated shoppinglist"+ shoppinglist);


    }
}
