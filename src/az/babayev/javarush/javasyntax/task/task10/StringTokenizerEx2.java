package az.babayev.javarush.javasyntax.task.task10;

import java.util.Arrays;

/*
Используя StringTokenizer раздели query на части по разделителю delimiter.

Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}

Hint: решить задачу поможет метод countTokens(). Regex vasitəsilə nümunə
 */
public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        String[] array = query.split(delimiter);
        return array;
    }
}
