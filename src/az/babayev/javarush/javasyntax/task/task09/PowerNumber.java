package az.babayev.javarush.javasyntax.task.task09;

/*
Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.
 */
public class PowerNumber {

    public static int getpowerTwo(int power) {
        return 2 << (power - 1);

    }

    public static void main(String[] args) {
        int i = getpowerTwo(4);
        System.out.println(i);

    }
}
