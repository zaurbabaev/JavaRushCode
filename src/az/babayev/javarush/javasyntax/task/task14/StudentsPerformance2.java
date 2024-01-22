package az.babayev.javarush.javasyntax.task.task14;

import java.util.HashMap;
import java.util.Set;

/*
В классе StudentsPerformance2 объявлено поле grades типа HashMap<String, Double>,
где ключ — имя и фамилия студента, а значение - его средняя оценка.
На этот раз твоя задача — реализовать методы:
printStudents, который выводит только имена всех студентов (ключ коллекции);
getAverageMark, который возвращает средний балл всех студентов.
 */
public class StudentsPerformance2 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        Set<String> students = grades.keySet();
        System.out.println(students);
    }

    public static Double getAverageMark() {
        Set<String> keys = grades.keySet();
        Double grade = 0d;
        Double sum = 0d;
        for (String key : keys) {
            grade = grades.get(key);
            sum += grade;
        }
        return sum / grades.size();
    }
}
