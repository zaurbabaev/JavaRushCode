package az.babayev.javarush.javasyntax.repetition;

public class Test1 {
    public static void main(String[] args) {
        int n = 0;
        while (n < 4) {
            int m = 0;
            while (m < 5) {
                m++;
                System.out.print("A");
            }
            n++;
            System.out.println();
        }

    }
}

class Test2 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 20) {
            i++;
            if (i % 7 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
