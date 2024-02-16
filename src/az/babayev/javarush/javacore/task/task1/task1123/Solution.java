package az.babayev.javarush.javacore.task.task1.task1123;

import java.util.Arrays;

/*
Реализуй метод, который возвращает объект класса Pair. В поле x этого объекта
должно содержаться минимальное число, а в поле y - максимальное число из массива
inputArray.
 */
public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        Pair result = getMinimumMaximumPair(data);
        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        } else {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i : inputArray) {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
            return new Pair(min, max);
        }


    }

    // stream vasitəsi ilə
    public static Pair getMinimumMaximumPair2(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        } else {
            int max = Arrays.stream(inputArray).max().getAsInt();
            int min = Arrays.stream(inputArray).min().getAsInt();
            return new Pair(min, max);
        }

    }

    public static class Pair {

        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }


    }
}
