package az.babayev.javarush.javasyntax.task.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и
возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
 */
public class Task8_04 {
    public static class ConsoleReader {
        public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static String readString() throws Exception {
            return reader.readLine();
        }

        public static int readInt() throws Exception {
            return Integer.parseInt(reader.readLine());
        }

        public static double readDouble() throws Exception {
            return Double.parseDouble(reader.readLine());
        }

        public static boolean readBoolean() throws Exception {
            return Boolean.parseBoolean(reader.readLine());
        }

        public static void main(String[] args) throws Exception {
            System.out.println(readString());
            System.out.println(readInt());
            System.out.println(readDouble());
            System.out.println(readBoolean());


        }
    }
}
