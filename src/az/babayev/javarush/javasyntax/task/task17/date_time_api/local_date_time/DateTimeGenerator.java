package az.babayev.javarush.javasyntax.task.task17.date_time_api.local_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/*
В методе convert нужно преобразовать Map в Set.
Принцип преобразования:

если в sourceMap было два таких элемента:
2018-05-31=[12:43:00.615424667, 08:35:29.212766273]
1998-01-31=[07:56:59.931458499]

то в результате в множестве должно получиться три элемента:
2018-05-31T12:43:00.615424667
2018-05-31T08:35:29.212766273
1998-01-31T07:56:59.931458499
 */
public class DateTimeGenerator {
    private static final long MIN_DAY = LocalDate.of(1990, 1, 1).toEpochDay();
    private static final long MAX_DAY = LocalDate.of(2020, 12, 31).toEpochDay();
    private static final long maxNano = 86399999999999L;

    public static LocalDate generateDate() {
        long randomDay = ThreadLocalRandom.current().nextLong(MIN_DAY, MAX_DAY);
        return LocalDate.ofEpochDay(randomDay);
    }

    public static LocalTime generateTime() {
        long randomTime = ThreadLocalRandom.current().nextLong(0, maxNano);
        return LocalTime.ofNanoOfDay(randomTime);
    }

    public static List<LocalTime> generateTimeList() {
        ArrayList<LocalTime> timeList = new ArrayList<>();
        long size = ThreadLocalRandom.current().nextLong(1, 5);
        for (int i = 0; i < size; i++) {
            timeList.add(generateTime());
        }
        return timeList;
    }

    public static Map<LocalDate, List<LocalTime>> generateDateMap() {
        Map<LocalDate, List<LocalTime>> dateMap = new HashMap<>();
        int size = ThreadLocalRandom.current().nextInt(3, 7);
        for (int i = 0; i < size; i++) {
            dateMap.put(generateDate(), generateTimeList());
        }
        return dateMap;
    }
}

class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());
        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> localDateTimes = new HashSet<>();
        Set<Map.Entry<LocalDate, List<LocalTime>>> entries = sourceMap.entrySet();
        for (Map.Entry<LocalDate, List<LocalTime>> entry : entries) {
            LocalDate key = entry.getKey();
            List<LocalTime> value = entry.getValue();
            for (LocalTime localTime : value) {
                localDateTimes.add(LocalDateTime.of(key, localTime));
            }
        }
        return localDateTimes;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("---------------------------");
        collection.forEach(System.out::println);
    }

    static Set<LocalDateTime> convert2(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> localDateTimes = new HashSet<>();
        sourceMap.forEach((key, value) -> value.forEach(val ->
                localDateTimes.add(LocalDateTime.of(key, val))));
        return localDateTimes;
    }
}
