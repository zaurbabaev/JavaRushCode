package az.babayev.javarush.javasyntax.task.task08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.
 */
public class Task6_03 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList<>()));
        System.out.println(getInsertTimeInMs(new LinkedList<>()));
    }

    public static long getInsertTimeInMs(List list) {
        long start = System.currentTimeMillis();
        insert10000(list);
        long end = System.currentTimeMillis();
        return (end - start);
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }

}
