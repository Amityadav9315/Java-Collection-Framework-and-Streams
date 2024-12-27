package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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
        Set<Integer> set=new LinkedHashSet<>();
        set.add(34);
        set.add(54);
        set.add(76);
        set.add(98);
        System.out.println(set);


    }
}