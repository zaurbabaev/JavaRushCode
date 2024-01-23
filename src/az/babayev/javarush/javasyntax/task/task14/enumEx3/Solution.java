package az.babayev.javarush.javasyntax.task.task14.enumEx3;

import az.babayev.javarush.javasyntax.task.task04.Minimum;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Month[] winterMonths = Month.getWinterMonths();
        System.out.println(Arrays.toString(winterMonths));
        Month[] springMonths = Month.getSpringMonths();
        System.out.println(Arrays.toString(springMonths));
        Month[] summerMonths = Month.getSummerMonths();
        System.out.println(Arrays.toString(summerMonths));
        Month[] autumnMonths = Month.getAutumnMonths();
        System.out.println(Arrays.toString(autumnMonths));
    }
}
