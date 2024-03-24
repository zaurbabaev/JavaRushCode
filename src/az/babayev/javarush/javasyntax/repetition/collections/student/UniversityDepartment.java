package az.babayev.javarush.javasyntax.repetition.collections.student;

import java.util.ArrayList;

public class UniversityDepartment {
    public static void main(String[] args) {
        var students = new ArrayList<Student>() {
            {
                add(new Student("Akaki"));
                add(new Student("Vladislav"));
            }
        };
        printStudentNames(students);
    }

    private static void printStudentNames(ArrayList<Student> students) {
        students.stream().map(Student::getName).forEach(System.out::println);
    }

}
