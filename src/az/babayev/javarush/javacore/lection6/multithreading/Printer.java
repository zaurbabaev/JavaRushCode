package az.babayev.javarush.javacore.lection6.multithreading;

public class Printer implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm printer");
        System.out.println("printer thread finished");
    }
}
