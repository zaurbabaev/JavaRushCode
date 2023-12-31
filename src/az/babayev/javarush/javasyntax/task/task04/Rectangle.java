package az.babayev.javarush.javasyntax.task.task04;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран
прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.

Пример вывода:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
 */
public class Rectangle {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int m = 0;
            while (m < 10) {
                m++;
                System.out.print("Q");
            }
            System.out.println();
            i++;
        }

    }
}
