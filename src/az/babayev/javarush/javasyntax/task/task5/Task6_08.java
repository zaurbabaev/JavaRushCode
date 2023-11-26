package az.babayev.javarush.javasyntax.task.task5;

/*
Создать class Person. У человека должно быть имя String name,
возраст int age, пол char sex.
Создай геттеры и сеттеры для всех переменных класса Person.
 */
public class Task6_08 {
    public static class Person {
        private String name;
        private int age;
        private char sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }
    }
}
