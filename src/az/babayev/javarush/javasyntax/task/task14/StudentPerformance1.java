package az.babayev.javarush.javasyntax.task.task14;

import java.util.HashMap;

/*
В классе StudentPerformance1 объявлено поле grades типа HashMap<String, Double>,
где ключ — имя и фамилия студента, а значение - его средняя оценка.
Твоя задача — реализовать метод addStudents, который добавит 5 студентов
 с их средней оценкой в коллекцию grades.
Значения можешь выбрать любые.
 */
public class StudentPerformance1 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);

    }

    public static void addStudents() {
        grades.put("Ivan Ivanov", 8.5);
        grades.put("Petr Petrov", 7.5);
        grades.put("Mariya Sidrovna", 9.5);
        grades.put("Pavel Shevchenko", 8.5);
        grades.put("Andrey Sumin", 8.5);
    }
}
