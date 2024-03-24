package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLIstExample6 {
    public static List<String> programmingLanguages = new ArrayList<>(
            Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        programmingLanguages.remove("Pascal");
        System.out.println(programmingLanguages);
    }


}
