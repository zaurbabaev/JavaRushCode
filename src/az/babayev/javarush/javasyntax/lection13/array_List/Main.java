package az.babayev.javarush.javasyntax.lection13.array_List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        ArrayList<Cat> cats = new ArrayList<>() {
            {
                add(thomas);
                add(behemoth);
                add(pushok);
            }
        };

        int index = cats.indexOf(thomas);
        System.out.println(index);

        Cat cat = cats.get(1);
        System.out.println(cat);

        boolean contains = cats.contains(pushok);
        System.out.println(contains);
        System.out.println(cats);

        cats.add(0,philipp);
        System.out.println(cats);

        cats.set(4,philipp);
        System.out.println(cats);
    }
}
