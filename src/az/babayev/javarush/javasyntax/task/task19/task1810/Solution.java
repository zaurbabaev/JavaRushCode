package az.babayev.javarush.javasyntax.task.task19.task1810;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
В классе Solution есть два публичных статических метода:

String[] toStringArray(ArrayList<String>), в котором нужно преобразовать
список строк в массив строк и вернуть его;
Integer[] toIntegerArray(ArrayList<Integer>), в котором нужно преобразовать
список чисел в массив чисел и вернуть его.
Для преобразования списка в массив используй метод списка toArray(),
в который нужно передать ссылку на конструктор массива, тип которого
соответствует типу списка.
Метод main() не принимает участие в тестировании.
 */
public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>(List.of(
                "Ti", "je", "programmist"
        ));

        String[] stringArray = toStringArray(strings);

        Arrays.stream(stringArray).forEach(System.out::println);

        System.out.println("-".repeat(30));

        var integers = new ArrayList<Integer>(List.of(
                1000, 2000, 3000
        ));

        Integer[] integerArray = toIntegerArray(integers);

        Arrays.stream(integerArray).forEach(System.out::println);
    }

    public static String[] toStringArray(ArrayList<String> strings) {
        return strings.toArray(String[]::new);
//        return strings.toArray(new String[0]);
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        return integers.toArray(Integer[]::new);
//        return integers.toArray(new Integer[0]);

    }
}
