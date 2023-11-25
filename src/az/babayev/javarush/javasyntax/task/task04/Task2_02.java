package az.babayev.javarush.javasyntax.task.task04;

/*
Напиши код в методе addNewCat, чтобы при его вызове количество
котов увеличивалось на 1.
За количество котов отвечает переменная catsCount.
 */
public class Task2_02 {

    public static class Cat {
        private static int catsCount=0;

        public static void addNewCat() {
            catsCount++;
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            addNewCat();
            System.out.println(catsCount);
            Cat cat2 = new Cat();
            addNewCat();
            System.out.println(catsCount);

        }
    }
}
