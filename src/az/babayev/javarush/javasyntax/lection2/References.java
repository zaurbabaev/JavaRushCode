package az.babayev.javarush.javasyntax.lection2;

public class References {
    public static void main(String[] args) {
        Student olga = new Student();
        olga.name = "Olga";
        olga.age = 21;

        Student vera = new Student();
        vera.name = "Veronika";
        vera.age = 15;

        System.out.println("Olga -> " + olga.age);
        System.out.println("Veronika -> " + vera.age);


        ageSwap(olga, vera);
        System.out.println("Olga -> " + olga.age);
        System.out.println("Veronika -> " + vera.age);

    }

    public static void ageSwap(Student a, Student b) {
        int c = a.age;
        a.age = b.age;
        b.age = c;
    }

    public static class Student {
        String name;
        int age;
    }
}
