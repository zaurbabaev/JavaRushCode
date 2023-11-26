package az.babayev.javarush.javasyntax.task.task04;

/*
Используя цикл for вывести на экран прямоугольный треугольник из
восьмёрок со сторонами 10 и 10.
 */
public class Task13_03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int i1 = 0; i1 < i; i1++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
