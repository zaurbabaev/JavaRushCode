package az.babayev.javarush.javasyntax.lection9;

public class MathRandomEx1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random()*6+1);
            System.out.print(random+" ");
        }

    }
}
