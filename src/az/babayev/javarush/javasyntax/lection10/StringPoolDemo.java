package az.babayev.javarush.javasyntax.lection10;

public class StringPoolDemo {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello").intern();
        String s3 = "Hello";
        String s4 = new String("How are you");
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1.intern() == s3);
    }
}
