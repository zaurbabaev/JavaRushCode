package az.babayev.javarush.javasyntax.task.task5;

/*
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол

Примечание:
Имя(String), возраст(int), пол(char).
 */
public class Task7_01 {

    public static class Friend {
        String name;
        int age;
        char sex;
        public void initialize(String name) {
            this.name = name;
        }
        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void initialize(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
