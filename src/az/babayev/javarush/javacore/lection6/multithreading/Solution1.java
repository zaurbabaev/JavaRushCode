package az.babayev.javarush.javacore.lection6.multithreading;

public class Solution1 {
    public static void main(String[] args) {
        Printer2 printer1 = new Printer2("Mika");
        printer1.start();
        Printer2 printer2 = new Printer2("Olya");
        printer2.start();
    }
}
