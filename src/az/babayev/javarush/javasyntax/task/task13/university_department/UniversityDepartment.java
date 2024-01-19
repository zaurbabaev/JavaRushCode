package az.babayev.javarush.javasyntax.task.task13.university_department;

import java.util.ArrayList;

/*
В классе UniversityDepartment есть метод printStudentNames(ArrayList),
который принимает список объектов и выводит их имена.
Но на данный момент программа не компилируется.
Твоя задача исправить этот баг. Для этого нужно исправить
сигнатуру метода printStudentNames(ArrayList),
чтобы он принимал список объектов только типа Student(используй дженерик).
Метод main не участвует в проверке.
 */
public class UniversityDepartment {
    public static void main(String[] args) {
        var students = new ArrayList<Student>() {
            {
                add(new Student("Sasha"));
                add(new Student("Misha"));
            }
        };
        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
