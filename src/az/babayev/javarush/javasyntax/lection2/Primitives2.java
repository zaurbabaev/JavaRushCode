package az.babayev.javarush.javasyntax.lection2;

public class Primitives2 {
    public static void main(String[] args) {
        Student olga = new Student();
        olga.name = "Olga";
        olga.age = 21;
        Student vera = new Student();
        vera.name = "Veronika";
        vera.age = 15;

        System.out.println("Olga -> " + olga.age);
        System.out.println("Veronika -> " + vera.age);

        Student a = olga, b = vera;

        int c = a.age;
        a.age = b.age;
        b.age = c;

        System.out.println("Olga -> " + olga.age);
        System.out.println("Veronika -> " + vera.age);


    }

    public static class Student {
        public String name;
        public int age;
    }
}
