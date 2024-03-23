package az.babayev.javarush.javasyntax.repetition.static_class;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    static List<Point> points = new ArrayList<>();

    public static void main(String[] args) {

        Point point = new Point();
//        Solution.Point point1 = new Solution.Point();
        point.x = 12;
        point.y = 34;
        points.add(point);
        System.out.println(points);
    }

    public static class Point {
        int x;
        int y;

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
