package az.babayev.javarush.javasyntax.task.task5;

/*
Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал
 все переменные класса Person.
 */
public class Task7_07 {
    public static class Person {
        String name;
        char sex;

        int money;

        int weight;
        double size;

        public void initialize(String name, int money, char sex, int weight, int size) {
            this.name = name;
            this.money = money;
            this.sex = sex;
            this.weight = weight;
            this.size = size;
        }

    }
}
