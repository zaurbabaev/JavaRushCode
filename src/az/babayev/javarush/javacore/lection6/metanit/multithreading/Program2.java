package az.babayev.javarush.javacore.lection6.metanit.multithreading;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        JThread thread = new JThread("JThread");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.printf("%s has been interrupted... \n",thread.getName());
        }
        System.out.println("Main thread finished...");
    }
}
