package az.babayev.javarush.javasyntax.task.task08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу:
 "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
 */
public class Task8_04 {

    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Сидров", dateFormat.parse("JUNE 3 1980"));
        map.put("Папов", dateFormat.parse("MARCH 5 2002"));
        map.put("Магомедов", dateFormat.parse("JULY 11 1975"));
        map.put("Иванов", dateFormat.parse("AUGUST 10 1980"));
        map.put("Никитин", dateFormat.parse("JUNE 9 1970"));
        map.put("Алексеев", dateFormat.parse("JANUARY 21 1990"));
        map.put("Зайцев", dateFormat.parse("FEBRUARY 9 1998"));
        map.put("Коротков", dateFormat.parse("DECEMBER 5 2000"));
        map.put("Копылов", dateFormat.parse("JUNE 13 2001"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        map.entrySet().removeIf(entry -> entry.getValue().getMonth() >=5
                && entry.getValue().getMonth() <= 7);
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);
    }
}
