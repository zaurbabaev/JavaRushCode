package az.babayev.javarush.javasyntax.task.task6;

/*
Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).
 */
public class Task8_02 {

    public static class Cat {
        private static int catCount = 0;

        public Cat() {
            catCount++;
        }

        public static int getCatCount() {
            return catCount;
        }

        public static void setCatCount(int catCount) {
            Cat.catCount = catCount;
        }

        public static void main(String[] args) {
           Cat.setCatCount(10);

            System.out.println(Cat.getCatCount());
        }
    }
}
