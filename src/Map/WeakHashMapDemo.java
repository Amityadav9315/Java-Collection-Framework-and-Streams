package Map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {




    public static void main(String[] args) {
        WeakHashMap<String,Image> imageCache=new WeakHashMap<>();
        imageCache.put("img1",new Image("Image 1"));
        imageCache.put("img2",new Image("Image2"));
        System.out.println();


    }
}
class Image{
    private String name;

    public Image(String name){
        this.name=name;
    }
    @Override
    public  String toString(){
        return  name;
    }
}
