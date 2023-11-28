package az.babayev.javarush.javasyntax.task.task6;

import java.util.ArrayList;

/*
1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот.
Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
 */
public class Task8_09 {
    public static class Cat {
        public static ArrayList<Cat> cats = new ArrayList<>();

        public Cat() {

        }

        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                cats.add(new Cat());
            }
            printCats();
        }

        public static void printCats() {
            for (Cat cat : cats) {
                System.out.println(cat);
            }
        }
    }
}
