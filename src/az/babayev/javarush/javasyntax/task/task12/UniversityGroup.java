package az.babayev.javarush.javasyntax.task.task12;

import java.util.ArrayList;
import java.util.List;

/*
У нас есть группа в университете и метод, который должен отчислять конкретного студента,
но он почему-то не работает.
Твоя задача — найти ошибку и исправить, чтобы метод exclude смог отчислить студента.
 */
public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
//        List<String> copy = new ArrayList<>(students);
//        for (String student : copy) {
//            if (student.equals(excludedStudent)) {
//                students.remove(student);
//            }
//        }
        students.removeIf(student -> student.equals(excludedStudent));
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}
