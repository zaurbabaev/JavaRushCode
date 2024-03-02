package az.babayev.javarush.javacore.lection6.metanit.multithreading.interrupt;

public class MyThread implements Runnable {
    private boolean isActive;

    public void disable() {
        isActive = false;
    }

    public MyThread() {
        isActive = true;
    }

    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1;

        while (isActive) {
            System.out.println("Loop " + counter++);
            try {
                Thread.sleep(400L);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
        System.out.printf("%s finished \n", Thread.currentThread().getName());
    }
}
