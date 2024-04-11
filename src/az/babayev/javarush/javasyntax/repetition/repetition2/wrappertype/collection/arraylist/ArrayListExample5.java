package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample5 {
    private static List<String> programmingLanguage = new ArrayList<>(
            Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal")
    );

    public static void main(String[] args) {
        programmingLanguage.remove("Pascal");
        System.out.println(programmingLanguage);
    }


}
