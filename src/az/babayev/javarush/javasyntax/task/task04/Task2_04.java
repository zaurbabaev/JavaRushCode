package az.babayev.javarush.javasyntax.task.task04;

/*
Допишите код метода setName, чтобы с его помощью установить значение
private String fullName равное значению локальной переменной String fullName.
 */
public class Task2_04 {

    public static class Cat {
        private String fullName;

        public void setName(String firstName, String lastName) {
            String fullName = firstName + " " + lastName;
            this.fullName = fullName;
        }

        public static void main(String[] args) {
            Cat cat =new Cat();
            cat.setName("Barsik","Barsik");
            System.out.println(cat.fullName);

        }
    }
}
