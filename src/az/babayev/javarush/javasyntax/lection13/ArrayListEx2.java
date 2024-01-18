package az.babayev.javarush.javasyntax.lection13;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            integers.add(console.nextInt());
        }
        console.close();

        for (int i = 0; i < integers.size(); i++) {
            int n = integers.size() - i - 1;
            System.out.print(integers.get(n) + " ");
        }
    }
}
