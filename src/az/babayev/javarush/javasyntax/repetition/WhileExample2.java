package az.babayev.javarush.javasyntax.repetition;

public class WhileExample2 {
    public static void main(String[] args) {

        System.out.println("\t2\t3\t4\t5\t6\t7\t8\t9\t10");

        int i = 2;
        while (i < 10) {
            System.out.print(i + " | ");
            int j = 2;
            while (j <= 10) {
                int multi = i * j;
                System.out.print(multi + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
