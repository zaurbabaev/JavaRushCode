package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
то треугольника с такими сторонами не существует.
 */
public class Task4_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        triangle(a, b, c);
    }

    public static void triangle(int a, int b, int c) {
        String yes = "Треугольник существует.";
        String no = "Треугольник не существует.";
        String message = (a + b > c && (a + c > b) && (b + c > a)) ? yes : no;
        System.out.println(message);

    }
}
