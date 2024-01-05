package az.babayev.javarush.javasyntax.lection4;

public class WhileExample6 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();

        int i = 2;
        while (i < 10) {
            System.out.print(i + " | ");
            int j = 2;
            while (j < 10) {
                System.out.print(i * j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }


    }
}