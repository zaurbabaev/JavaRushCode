package az.babayev.javarush.javasyntax.task.task04;

/*
Помогите коту обрести имя с помощью метода setName.
 */
public class Task2_01 {


    public static class Cat {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Cat cat=new Cat();
            cat.setName("Barsik");
            System.out.println(cat.name);
        }
    }
}
