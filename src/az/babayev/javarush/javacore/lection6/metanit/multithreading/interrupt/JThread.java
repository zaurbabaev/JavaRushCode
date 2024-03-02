package az.babayev.javarush.javacore.lection6.metanit.multithreading.interrupt;

public class JThread extends Thread {
    public JThread(String name) {
        super(name);
    }

    public void run() {
        // Thread klasından extend etdiyimizə görə statik metodlara birbaşa müraciət edə bilirik
        System.out.printf("%s started... \n", currentThread().getName());
        int counter = 1;
        while (!isInterrupted()) {
            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s finished... \n", currentThread().getName());

    }
}
