package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2);
        linkedList.addLast(4);
         linkedList.addFirst(0);
         linkedList.getFirst();
         linkedList.getLast();
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);

        LinkedList<String> animals=new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalToRemove=new LinkedList<>(Arrays.asList("Dog","Lion"));
        animals.removeAll(animalToRemove);
        System.out.println(animals);


    }


}
