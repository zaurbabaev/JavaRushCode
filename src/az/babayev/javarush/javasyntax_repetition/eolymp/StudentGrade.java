package az.babayev.javarush.javasyntax_repetition.eolymp;

import java.util.Scanner;

/*
Определить уровень учебных достижений ученика (начальный, средний, достаточный, высокий)
в соответствии с заданной оценкой (от 1 до 12).
Вывести Initial для начального уровня (оценка от 1 до 3),
Average - для среднего (оценка от 4 до 6),
Sufficient - для достаточного (оценка от 7 до 9) и
High - для высокого (оценка от 10 до 12).
 */
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if (grade <= 3) {
            System.out.println("Initial");
        } else if (grade <= 6) {
            System.out.println("Average");
        } else if (grade <= 9) {
            System.out.println("Sufficient");
        } else if (grade <= 12) {
            System.out.println("High");
        }
    }
}
