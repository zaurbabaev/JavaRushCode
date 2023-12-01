package az.babayev.javarush.javasyntax.task.task7;

import java.util.ArrayList;

public class Task6_07 {
    public static void main(String[] args) {
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0) {
                even.add(x);
                evenSum += x;
            } else {
                odd.add(x);
                oddSum += x;
            }

        }

        System.out.println(even + " " + evenSum);
        System.out.println(odd + " " + oddSum);
    }
}
