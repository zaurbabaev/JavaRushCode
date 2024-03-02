package az.babayev.javarush.javacore.lection6.metanit.multithreading.isInterrupted2;

public class MyThread2 implements Runnable {

    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1;
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Loop " + counter++);
                Thread.sleep(100L);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "has been interrupted");
            System.out.println(Thread.currentThread().isInterrupted());

        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
