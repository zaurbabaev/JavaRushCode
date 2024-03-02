package az.babayev.javarush.javacore.lection6.metanit.multithreading.isInterrupted2;

public class MyThreadMain2 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        MyThread2 myThread = new MyThread2();
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
