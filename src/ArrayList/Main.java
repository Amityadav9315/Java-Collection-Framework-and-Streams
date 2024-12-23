package ArrayList;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComperator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s2.length() -s1.length();

    }
}
class MyComperator implements  Comparator<Integer>{

    @Override
    public int compare(Integer o1,Integer o2){
        return  o1-o2;
    }
}

class Student{
      private String  name;
      private  double gpa;

      public Student(String name,double gpa){
          this.name=name;
          this.gpa=gpa;
      }

      public String  getName(){
          return  name;

      }
      public double getgpa(){
          return gpa;
      }
        }


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



//        List<String> list=new ArrayList<>();
//        System.out.println(list.getClass().getName());
//        List<String> list1= Arrays.asList("Monday","Tuesday");
//        System.out.println(list1.getClass().getName());
//        list1.add("Wednesday");
//        String[] array={"Apple","Banana","Mango"};
//        List<String> list2=Arrays.asList(array);



//        List<String > words=Arrays.asList("banana","apple","data");
//        words.sort((a,b) -> b.length() - a.length());
//        System.out.println(words);
//        List<Integer> list=new ArrayList<>();
//        list.add(2);
//        list.add(1);
//        list.add(3);
//
//        list.sort((a,b) ->a-b);
//        System.out.println(list);


        List<Student> students=new ArrayList<>();
        students.add(new Student("Alice",3.5));
        students.add(new Student("Bob",3.7));
        students.add(new Student("Charlie",3.5));
        students.add(new Student("Akshit",3.9));
        students.sort((o1,o2) -> {
            if(o2.getgpa()-o1.getgpa()>0){
                return 1;
            }
            else if(o2.getgpa()- o1.getgpa()<0){
                return -1;

            }
            else{
                return 0;
            }
        });
        for(Student s:students){
            System.out.println(s.getName() +" :"+s.getgpa());
        }


    }
}
