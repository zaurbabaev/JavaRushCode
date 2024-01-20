package az.babayev.javarush.javasyntax.lection13.array_List;

import az.babayev.javarush.javasyntax.task.task12.object_inner_nested_class.Outer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        Cat[] catsArray = {thomas, behemoth, philipp, pushok};

        // massivi listə çeviririk
        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(catsArray));
        System.out.println(cats);

        // listi massivə çeviririk
        Cat[] array = cats.toArray(new Cat[0]);
        System.out.println(Arrays.toString(array));



    }
}
