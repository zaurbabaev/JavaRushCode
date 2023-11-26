package az.babayev.javarush.javasyntax.task.task5;

/*
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
 */
public class Task9_01 {
    public static class Friend {

        String name;
        int age;
        char sex;

        public Friend(String name) {
            this.name = name;
        }

        public Friend(String name, int age) {
            this(name);
            this.age = age;
        }

        public Friend(String name, int age, char sex) {
            this(name, age);
            this.sex = sex;
        }

    }
}
