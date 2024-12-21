package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      //  ArrayList<Integer> list=new ArrayList<>(1000);
   //    list.add(1);
//        list.add(23);
//        list.add(56);
     //   System.out.println(list.size());
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        for(int x: list){
//            System.out.print(x);
//        }
       // list.remove(2);
        //System.out.println(list.size());
       // System.out.println(list.get(1));
        List<String> list=new ArrayList<>();
        System.out.println(list.getClass().getName());
        List<String> list1= Arrays.asList("Monday","Tuesday");
        System.out.println(list1.getClass().getName());
        list1.add("Wednesday");
        String[] array={"Apple","Banana","Mango"};
        List<String> list2=Arrays.asList(array);


    }
}
