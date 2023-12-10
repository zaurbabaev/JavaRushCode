package az.babayev.javarush.javasyntax.lection7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(12);
        number.add(31);
        number.add(14);
//        number.remove(Integer.valueOf(14));
        Iterator<Integer> iterator = number.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 31) {
                iterator.remove();
            }
        }
        System.out.println(number);

//        List<String> stringList = new ArrayList<>();
//        stringList.add("Hello");
//        stringList.add("Poka");
//        stringList.add("Ok");
//        stringList.add("Amigo");
//        stringList.remove("Ok");
//        System.out.println(stringList);
    }
}
