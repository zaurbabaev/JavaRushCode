package az.babayev.javarush.javacore.task.task4.task14201;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int gcd = gcd(a, b);
        System.out.println(gcd);

    }

    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }
        return gcd(b, (a % b));
    }

    public static int gcd2(int a, int b) {
        while (a > 0 && b > 0) {
            if (a >= b) {
                a = a % b;
            } else b = b % a;
        }
        return Math.max(a, b);
    }
}
