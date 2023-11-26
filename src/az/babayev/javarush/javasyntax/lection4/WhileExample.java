package az.babayev.javarush.javasyntax.lection4;

public class WhileExample {
    public static void main(String[] args) {
        int i = 3;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }

}

class WhileExample2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }
    }
}
