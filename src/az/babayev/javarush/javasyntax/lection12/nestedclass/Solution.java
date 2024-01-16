package az.babayev.javarush.javasyntax.lection12.nestedclass;

import java.util.ArrayList;

public class Solution {
    static ArrayList<Point> points = new ArrayList<>();


    public static void main(String[] args) {
        Point point = new Point();
        point.x = 100;
        point.y = 200;
        points.add(point);


        Solution.Point point1 = new Solution.Point();
        point1.x = 40;
        point1.y = 30;
        points.add(point1);

        System.out.println(points);
        point1.getPoint();


    }

    static class Point {
        int x;
        int y;

        public void getPoint() {
            System.out.println(x + y);
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }


}
