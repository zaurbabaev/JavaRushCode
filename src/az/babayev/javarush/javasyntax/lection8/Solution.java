package az.babayev.javarush.javasyntax.lection8;

public class Solution {
   public static void printPoint(Point[] points){
       for (int i = 0; i < points.length; i++) {
           points[i].print();
       }
   }

    public static void main(String[] args) {
        Point[] data = new Point[10];
        for (int i = 0; i < data.length; i++) {
            data[i]=new Point();
        }
        printPoint(data);
    }
}
