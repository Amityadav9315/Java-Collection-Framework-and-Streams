package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {
    public static void main(String[] args) {


        //for random order
//        Set<Integer> set = new HashSet<>();
//        set.add(34);
//        set.add(54);
//        set.add(65);
//        set.add(98);
//        System.out.println(set);
//

        //for as it is order
//        Set<Integer> set=new LinkedHashSet<>();
//        set.add(34);
//        set.add(54);
//        set.add(76);
//        set.add(98);
//        System.out.println(set);

        //for ascending order
        Set<Integer> set=new TreeSet<>();
        set.add(45);
        set.add(34);
        set.add(98);
        set.add(0);
        set.add(23);
        System.out.println(set);


    }
}