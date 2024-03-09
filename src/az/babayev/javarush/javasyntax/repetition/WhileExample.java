package az.babayev.javarush.javasyntax.repetition;

public class WhileExample {
    public static void main(String[] args) {

        System.out.println("    2  3  4  5  6  7  8  9");
        int i = 2;
        while (i < 10) {
            System.out.print(i + " | ");
            int j = 2;
            while (j < 10) {
                int multi = i * j;
                if (multi < 10) {
                    System.out.print(multi + "  ");
                } else {
                    System.out.print(multi + " ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
