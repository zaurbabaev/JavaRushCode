package az.babayev.javarush.javasyntax.task.task10;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
Используя StringTokenizer раздели query на части по разделителю delimiter.

Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}

Hint: решить задачу поможет метод countTokens().
 */
public class StringTokenizerEx {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        int count = tokenizer.countTokens();
        String[] token = new String[count];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            token[i] = tokenizer.nextToken();
            i++;
        }
        return token;
    }
}
