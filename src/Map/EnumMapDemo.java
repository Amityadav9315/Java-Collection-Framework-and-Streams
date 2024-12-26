package Map;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.HashMap;

public class EnumMapDemo {
    public static void main(String[] args) {
        Enum<Day,String> map=new EnumMap<>();  
    }

    }
enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
}
