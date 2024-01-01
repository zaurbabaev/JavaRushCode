package az.babayev.javarush.javasyntax.task.task04;

import java.util.Scanner;

/*
Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
Слово "enough" выводить не нужно.
Для этого необходимо использовать бесконечный цикл (while(true)).

Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
 */
public class WhileScanner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();
            if (s.equals("enough")) {
                break;
            }
            System.out.println(s);
        }
    }

}
