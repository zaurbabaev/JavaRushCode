package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.arraylist.student;

import java.util.ArrayList;
import java.util.List;

public class UniversityDepartment {
    public static void printStudentNames(ArrayList<Student> students) {
        students.stream().map(Student::getName).forEach(System.out::println);
    }

    public static void main(String[] args) {
        var students = new ArrayList<Student>(List.of(new Student("Amigo"),new Student("Rishi")));

        printStudentNames(students);
    }
}
