package az.babayev.javarush.javasyntax.task.task4;

/*
Подсчитать суммарную стоимость яблок.
За суммарную стоимость яблок отвечает переменная public static int applesPrice.
 */
public class Task1_02 {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple1 = new Apple();
        apple1.addPrice(100);
        System.out.println("Apples price " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public void addPrice(int price) {
            Apple.applesPrice += price;
        }
    }
}
