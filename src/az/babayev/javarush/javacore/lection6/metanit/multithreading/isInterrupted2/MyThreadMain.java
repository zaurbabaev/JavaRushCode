package az.babayev.javarush.javacore.lection6.metanit.multithreading.isInterrupted2;

public class MyThreadMain {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread, "MyThread");
        thread.start();

        try {
            Thread.sleep(150L);
            thread.interrupt();
            Thread.sleep(150L);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}
