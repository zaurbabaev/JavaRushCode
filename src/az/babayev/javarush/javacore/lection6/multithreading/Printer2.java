package az.babayev.javarush.javacore.lection6.multithreading;

public class Printer2 extends Thread {
    private String name;

    Printer2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I'm " + name);
    }


}
