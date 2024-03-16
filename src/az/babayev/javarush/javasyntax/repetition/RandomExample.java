package az.babayev.javarush.javasyntax.repetition;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);

        for (int j = 0; j < 10; j++) {
            int i1 = random.nextInt(3, 12);
            System.out.println(i1);
        }

        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble(6));
        System.out.println(random.nextDouble(3, 9));

        System.out.println("-".repeat(30));
        System.out.println(random.nextFloat());
        System.out.println(random.nextFloat(6));
        System.out.println(random.nextFloat(3, 9));

        System.out.println("-".repeat(30));
        System.out.println(random.nextLong());
        System.out.println(random.nextLong(6));
        System.out.println(random.nextLong(3, 9));

        System.out.println("-".repeat(30));
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(6));
        System.out.println(random.nextInt(3, 9));

        System.out.println("-".repeat(30));
        System.out.println(random.nextGaussian());
        System.out.println(random.nextGaussian(4, 9));

        System.out.println("-".repeat(30));
        System.out.println(random.nextBoolean());

        int[] matrix=new int[15];
        for (int k = 0; k < matrix.length; k++) {
            matrix[k] = random.nextInt( 20);
        }

        System.out.println(Arrays.toString(matrix));

        byte[] array = new byte[10];
        random.nextBytes(array);
        for (byte b : array) {
            System.out.print(b+" ");
        }
        System.out.println();



    }
}
