package az.babayev.javarush.javasyntax.task.task09;

/*
В этой задаче тебе предстоит реализовать метод generateNumber(), который будет возвращать
 случайное число от 0 до 99.
В методе generateNumber() используй метод Math.random().
 */
public class Randomizer {
    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        int random = 0;
        for (int i = 0; i < 100; i++) {
            random = (int) (Math.random() * 100);
        }
        return random;
    }
}

