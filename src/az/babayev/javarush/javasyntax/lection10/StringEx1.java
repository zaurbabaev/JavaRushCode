package az.babayev.javarush.javasyntax.lection10;

import java.util.Arrays;
import java.util.Scanner;

/*
Давайте напишем программу, которая преобразовывает путь к файлу из Unix Style в Windows Style.
Unix в качестве разделителя директорий использует символ /, Windows — символ \.
 */
public class StringEx1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        char[] chars = path.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '/') {
                chars[i] = '\\';
            }
        }
        String result = new String(chars);
        System.out.println(result);

        System.out.println("-".repeat(20));
        String s = new String("Hello");
        char[] chars1 = s.toCharArray();
        System.out.println(Arrays.toString(chars1));
    }

}
