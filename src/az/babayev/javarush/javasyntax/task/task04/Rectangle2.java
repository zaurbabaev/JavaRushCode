package az.babayev.javarush.javasyntax.task.task04;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран
незаполненный прямоугольник (его контур) размером 10 (высота) на
20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.

Пример вывода:
ББББББББББББББББББББ
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
ББББББББББББББББББББ
 */
public class Rectangle2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 20) {
                j++;
                if (i == 0 || i == 9 || j == 1 || j == 20) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
            }
            i++;
            System.out.println();
        }
    }
}
