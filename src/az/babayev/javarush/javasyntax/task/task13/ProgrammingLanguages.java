package az.babayev.javarush.javasyntax.task.task13;

import java.util.ArrayList;
import java.util.Arrays;

/*
В методе main найди и удали язык
программирования Pascal из списка programmingLanguages.
 */
public class ProgrammingLanguages {
    public static ArrayList<String> programmingLanguages =
            new ArrayList<String>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
//        Iterator<String> iterator = programmingLanguages.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (next.contains("Pascal"))
//                iterator.remove();
//        }

        programmingLanguages.remove("Pascal");

//        programmingLanguages.removeIf(s -> s.contains("Pascal"));
        programmingLanguages.forEach(s -> System.out.print(s + " "));
    }

}
