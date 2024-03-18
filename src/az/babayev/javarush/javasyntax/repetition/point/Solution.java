package az.babayev.javarush.javasyntax.repetition.point;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        double maxValue = Double.MAX_VALUE;
        System.out.println(maxValue);
        double minValue = Double.MIN_VALUE;
        System.out.println(minValue);
       
        Point[] data = IntStream.range(0, 100).mapToObj(i -> new Point()).toArray(Point[]::new);

//        Point[] data = new Point[100];
//        for (int i = 0; i < data.length; i++) {
//            data[i] = new Point();
//        }
        printPoints(data);
    }

    private static void printPoints(Point[] data) {
        for (Point point : data) {
            point.print();
        }
    }
}
