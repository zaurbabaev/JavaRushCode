package az.babayev.javarush.javasyntax.repetition;

public class ThreadSleepExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Go");
    }
}
