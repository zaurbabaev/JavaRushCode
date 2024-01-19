package az.babayev.javarush.javasyntax.lection13;

public class ObjectEx2 {
    public static void main(String[] args) {
        Object[] objects = {12, "Hello", "Ok", 12.4};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof String) {
                String s = (String) objects[i];
                System.out.print(s + "\t");
            }
        }
        System.out.println();
        System.out.println("-".repeat(20));

        for (Object object : objects) {
            if (object instanceof String) {
                String s = (String) object;
                System.out.print(s + "\t");
            }
        }
        System.out.println();
    }
}
