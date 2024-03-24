package az.babayev.javarush.javasyntax.repetition.collections;

public class InstanceOfExample {
    public static void main(String[] args) {
        Object[] objects = {12, 34.5, "Hello"};
        for (Object object : objects) {
            if (object instanceof String) {
                System.out.println(object);
            }
        }
    }
}
