package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums;

import java.util.Arrays;

public class MonthMain {
    public static void main(String[] args) {
        Month[] winterMonth = Month.getWinterMonth();
        for (Month month : winterMonth) {
            System.out.println(month);
        }

        Month[] summerMonth = Month.getSummerMonth();
        System.out.println(Arrays.toString(summerMonth));
    }
}
