package Map;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day,String> map=new EnumMap<>(Day.class);
        map.put(Day.TUESDAY,"Gym");
        System.out.println(Day.TUESDAY.ordinal());
    }

    }
enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
}
