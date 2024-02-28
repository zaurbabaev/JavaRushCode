package az.babayev.javarush.javacore.lection6.multithreading;

public class MultithreadingEx {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread childThread = new Thread(printer);
        childThread.start();
        System.out.println("printer started");
        System.out.println("Main thread finished");
    }

}
