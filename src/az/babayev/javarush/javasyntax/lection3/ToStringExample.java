package az.babayev.javarush.javasyntax.lection3;

public class ToStringExample {

    public static void main(String[] args) {
        Cat cat = new Cat();
        String t1 = "Cat is " + cat;
        System.out.println(t1);

        int a = 5;
        String t2 = "A is " + a;
        System.out.println(t2);

        String t3 = a + " A is";
        System.out.println(t3);

        String t4 = "Cat is " + cat + a;
        System.out.println(t4);

        String t5 = a + " Cat is " + cat + a;
        System.out.println(t5);

//        String t6 = cat + a + "Cat is " + cat + a; // obyektlə ədədi birləşdirmək olmaz bu zaman avtomatik toString ba. vermir

        String t7= cat + (a + "Cat is ") + cat + a;
        System.out.println(t7);

        String t8= (cat + (a + "Cat is ") + cat) + a;
        System.out.println(t8);

    }

    public static class Cat {

    }

}
