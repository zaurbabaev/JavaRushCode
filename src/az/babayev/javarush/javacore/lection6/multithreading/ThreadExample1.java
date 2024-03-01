package az.babayev.javarush.javacore.lection6.multithreading;

public class ThreadExample1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
        System.out.println(t.isInterrupted());
        Thread.sleep(1000L);

        System.out.println(t);
    }
}
