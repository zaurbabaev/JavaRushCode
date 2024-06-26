package az.babayev.javarush.javasyntax.task.task6;

/*
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat)
статическая переменная catCount увеличивается на 1.
Создать 10 объектов Cat и вывести значение переменной catCount на экран.
 */
public class Task8_08 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount = 0;

        public Cat() {
            catCount++;
        }
    }
}
