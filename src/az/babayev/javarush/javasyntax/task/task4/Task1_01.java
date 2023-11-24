package az.babayev.javarush.javasyntax.task.task4;

public class Task1_01 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjust age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("Age is adjustAge() is: " + this.age);
        }
    }
}
