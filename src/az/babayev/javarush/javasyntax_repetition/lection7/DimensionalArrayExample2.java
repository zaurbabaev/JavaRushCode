package az.babayev.javarush.javasyntax_repetition.lection7;

import java.util.Scanner;

/*
Построить елочку используя двумерный массив.
 */
public class DimensionalArrayExample2 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hight = scanner.nextInt();
        array = new char[hight][];
        for (int i = 0; i < array.length; i++) {
            int save = i + 1;
            array[i] = new char[hight + save];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '*';
            }
        }

        for (int i = 0; i < array.length; i++) {
            int save = i + 1;
            for (int j = array.length - save; j >= 0; j--) {
                array[i][j] = ' ';
            }
        }

        for (char[] chars : array) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
