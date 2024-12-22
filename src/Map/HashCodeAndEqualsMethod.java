package Map;

import java.time.Period;
import java.util.HashMap;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<person,String> map=new HashMap<>();
        person p1=new person("Alice",1);
        person p2=new person("Bop",2);
        person p3=new person("Alice",1);


        map.put(p1,"Engineer");
        map.put(p2,"Desiginer");
        map.put(p3,"Manager");
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
}
