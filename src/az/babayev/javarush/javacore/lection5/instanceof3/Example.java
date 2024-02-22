package az.babayev.javarush.javacore.lection5.instanceof3;

public class Example {
    public static void main(String[] args) {
        Object i = 23;
        System.out.println((String) i); //java.lang.ClassCastException
    }
}
