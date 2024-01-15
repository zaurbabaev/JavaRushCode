package az.babayev.javarush.javasyntax.lection12;

public class ClassEx {
    public static void main(String[] args) {
        Class stringClass = String.class;
        System.out.println(stringClass);

        Class integerClass = int.class;
        System.out.println(integerClass);

        Class voidClass=void.class;
        System.out.println(voidClass);

        Class objectClass = Object.class;
        System.out.println(objectClass);

        Class integerClass1 = Integer.class;
        System.out.println(integerClass1);

        Class aClass = "Hello".getClass();
        System.out.println(aClass);
    }
}
