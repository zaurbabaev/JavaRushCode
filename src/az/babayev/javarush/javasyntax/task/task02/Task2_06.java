package az.babayev.javarush.javasyntax.task.task02;

/*
Выведи на экран длину окружности, рассчитанную по формуле:
L = 2 * Pi * radius (в методе printCircleLength).
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.
 */
public class Task2_06 {
    public static void main(String[] args) {
        double circleLenght = printCircleLenght(5);
        System.out.println(circleLenght);
    }

    public static double printCircleLenght(int radius) {
        return 2 * 3.14 * radius;
    }
}
