import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:list){
            System.out.println(i);
        }
        Iterator<Integer> iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
