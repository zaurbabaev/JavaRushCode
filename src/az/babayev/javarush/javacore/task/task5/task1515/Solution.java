package az.babayev.javarush.javacore.task.task5.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int A;
    public static int B;

    /*staticlərin initializasiyası zamanı ardıcıllıq nəzə alınmalıdır. Yuxarıdan aşağıya doğru.
    bu bloku A və B statik dəyişənlərindən uzaq qoysaq düzgün cavab almayacağıq beləki
    bu bloku final MİN dəyişənindən və ya min(int a, int b) metodundan sonra qoysaq düzgün işləməyəcək.
    */
    static {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {

                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static final int MIN = min(A, B);

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(MIN);
    }
}
