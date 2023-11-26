package az.babayev.javarush.javasyntax.task.task04;

/*
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
 */
public class Task10_05 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j < 10) {
                System.out.print(" " + (i * j));
                j++;
            }
            System.out.println(" " + (i * j));

            i++;
        }
    }
}
