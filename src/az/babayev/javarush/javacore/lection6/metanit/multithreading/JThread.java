package az.babayev.javarush.javacore.lection6.metanit.multithreading;

public class JThread extends Thread {
    public JThread(String name) {
        super(name);
    }

    public void run() {
        System.out.printf("%s started... \n", currentThread().getName());
        try {
            sleep(500L);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished... \n", currentThread().getName());
    }
}
