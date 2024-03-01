package az.babayev.javarush.javacore.lection6.metanit.multithreading;

public class MyThread {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Thread myThread = new Thread(() -> {
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        }, "MyThread");
        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }

        System.out.println("Main thread finished...");
    }
}
