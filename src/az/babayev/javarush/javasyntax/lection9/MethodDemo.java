package az.babayev.javarush.javasyntax.lection9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input count grades:");
        int count = Integer.parseInt(reader.readLine());
        int[] grades = new int[count];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Input grades:[" + i + "]");
            grades[i] = Integer.parseInt(reader.readLine());
        }
        printGrades(grades, "[", ".", "]");

        int max = getMax(grades);
        System.out.println("Max grade -> " + max);
    }

    private static int getMax(int[] ints) {
        int max = Integer.MIN_VALUE;
        for (int grade : ints) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    private static void printGrades(int[] grades, String leftBrackets, String delimiter, String rightBrackets) {
        System.out.print(leftBrackets);
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) {
                System.out.print(delimiter);
            }
        }
        System.out.println(rightBrackets);
    }


}
