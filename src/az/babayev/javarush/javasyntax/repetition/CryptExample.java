package az.babayev.javarush.javasyntax.repetition;

import java.util.Arrays;

public class CryptExample {

    public static int[] crypt(int[] data, int password) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i] ^ password;
        }
        return result;
    }


    public static int[] crypt2(int[] data, int password) {
        return Arrays.stream(data).map(dataValue -> dataValue ^ password).toArray();
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9, 11};
        int password = 199;

        int[] encrypted = crypt(data, password);
        System.out.println(Arrays.toString(encrypted));

        int[] decrypted = crypt(encrypted, password);
        System.out.println(Arrays.toString(decrypted));

        int[] encrypted2 = crypt2(data, password);
        System.out.println(Arrays.toString(encrypted2));

        int[] decrypted2 = crypt2(encrypted2, password);
        System.out.println(Arrays.toString(decrypted2));

        int a = 3;
        int b = 2;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);

    }

}
