package az.babayev.javarush.javasyntax.task.task19.task1803;

import java.util.ArrayList;
import java.util.Collections;

/*
В классе Solution есть статическое поле mentors, которое заполняется менторами
JavaRush (объектами типа JavaRushMentor) в методе main().
У ментора (класс JavaRushMentor) есть имя (поле name). В программе нужно
отсортировать менторов по длине имени в возрастающем порядке (от самого короткого
до самого длинного).

Чтобы отсортировать всех менторов в списке mentors используется метод
Collections.sort(ArrayList<JavaRushMentor>, Comparator<JavaRushMentor>),
в который передается список менторов mentors и компаратор сортировки.

Твоя задача — реализовать этот компаратор. Для этого в классе NameComparator
нужно имплементировать интерфейс Comparator<JavaRushMentor> и реализовать
метод int compare(JavaRushMentor mentor1, JavaRushMentor mentor2),
который возвращает числовое значение со следующими условиями:

отрицательное число, если длина имени ментора mentor1 меньше длины имени
ментора mentor2;
положительное число, если длина имени ментора mentor1 больше длины имени
ментора mentor2;
0, если длины имен менторов mentor1 и mentor2 одинаковы.
Метод main() не принимает участие в тестировании.
 */
public class Solution {

    public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new JavaRushMentor("Djon Bovrov"),
                new JavaRushMentor("Risha"),
                new JavaRushMentor("Elleonora Kerri"),
                new JavaRushMentor("Xans Nudls"),
                new JavaRushMentor("Kim"),
                new JavaRushMentor("Xulio Siesta"),
                new JavaRushMentor("Diego"),
                new JavaRushMentor("Laga Bilaabo"));

        mentors.sort(new NameComparator());

//        mentors.sort((s1,s2)->s1.getName().length()-s2.getName().length());

//        mentors.sort(Comparator.comparingInt(mentor -> mentor.getName().length()));

        mentors.forEach(System.out::println);
    }

}
