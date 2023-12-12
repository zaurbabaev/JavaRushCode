package az.babayev.javarush.javasyntax.task.task08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Для arrayList и linkedList провести 10 тысяч вставок,
удалений, а также вызовов get и set.
 */
public class Task6_02 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        LinkedList<Object> linkeList = new LinkedList<>();
        insert10000(linkeList);
        get10000(linkeList);
        set10000(linkeList);
        remove10000(linkeList);
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(i, 1);
        }
    }

    public static void remove10000(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
}
