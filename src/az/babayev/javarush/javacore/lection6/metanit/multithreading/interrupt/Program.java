package az.babayev.javarush.javacore.lection6.metanit.multithreading.interrupt;

public class Program {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread, "MyThread");
        thread.start();
        try {
            Thread.sleep(1100L);
            myThread.disable();
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}
