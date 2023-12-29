package az.babayev.javarush.javasyntax.lection2;

public class IntEx {
    public static void main(String[] args) {
        int a = (2 + 2) * 2;
        System.out.println(a);
        int b = (6 - 3) / (9 - 6);
        System.out.println(b);
        int c = (-2) * (-3);
        System.out.println(c);
        //int d = 3 / 0;  // Arithmetic Exception by zero

        int a1 = 1;
        System.out.println(a1);
        int b1 = 2;
        System.out.println(b1);
        int c1 = a1 * b1 + 2;
        System.out.println(c1);


        int x = 5;
        x = x + 1;
        x = x + 1;
        x = x + 1;
        x = x + 1;
        x = x + 1;
        System.out.println(x);

        int a2 = 5 / 2;
        System.out.println(a2);
        int b2 = 20 / 3;
        System.out.println(b2);
        int c2 = -6 / 5;
        System.out.println(c2);
        int d2 = 1 / 2;
        System.out.println(d2);

        int a3 = 5 % 2;
        System.out.println(a3);
        int b3 = 20 % 4;
        System.out.println(b3);
        int c3 = 9 % 5;
        System.out.println(c3);
        int d3 = 1 % 2;
        System.out.println(d3);
    }
}
