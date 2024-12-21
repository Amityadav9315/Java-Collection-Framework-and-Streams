package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(56);
        System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
