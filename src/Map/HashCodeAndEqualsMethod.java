package Map;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<person,String> map=new HashMap<>();
        person p1=new person("Alice",1);
        person p2=new person("Bop",2);
        person p3=new person("Alice",1);


        map.put(p1,"Engineer"); //hashcode -->index
        map.put(p2,"Desiginer");
        map.put(p3,"Manager");
        System.out.println("Hashmap Size:" +map.size());
        System.out.println("Value for p1"+ map.get(p1));
        System.out.println("Value for p3"+ map.get(p3));







        Map<String ,Integer> map1=new HashMap<>();
        map1.put("Shubham",90);
        map1.put("Neha",92);
        map1.put("Shubham",99);


    }

}

class person{
    private String  name;
    private int id;


    public person(String name,int id){
        this.name=name;
        this.id=id;


    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        person other=(person) obj;
        return id==other.getId() && Objects.equals(name,other.getName());
    }

    @Override
    public String toString() {
        return "id :"+ id+", name:"+name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }
}
