package az.babayev.javarush.javasyntax.task.task04;

/*
Напиши метод setCatsCount.
Метод должен устанавливать количество котов (catsCount).
 */
public class Task2_03 {

    public static class Cat {

        private static int catsCount = 0;

        private void setCatsCount(int count) {
            catsCount = count;
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setCatsCount(3);
            System.out.println(catsCount);
        }
    }
}
