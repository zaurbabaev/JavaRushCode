package az.babayev.javarush.javasyntax.lection4;

public class WhileContinueEx {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 20) {
            i++;
            if ((i % 7) == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
