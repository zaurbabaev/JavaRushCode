package az.babayev.javarush.javasyntax.task.task14;

import java.util.HashSet;
import java.util.Set;

/*
В классе Solution есть метод arrayToHashSet(String[]),
который должен из переданного массива вернуть HashSet<String> с теми же элементами.
Метод main не участвует в проверке.
 */
public class ReturnProcessing {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("_________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    private static HashSet<String> arrayToHashSet(String[] strings) {
//        return new HashSet<>(Arrays.asList(strings));

//        HashSet<String> hashSet = new HashSet<>();
//        Collections.addAll(hashSet,strings);
//        return hashSet;

        return new HashSet<String>(Set.of(strings));
    }


}
