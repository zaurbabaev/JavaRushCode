package az.babayev.javarush.javacore.lection6.metanit.multithreading.isInterrupted;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.printf("%s started...\n",Thread.currentThread().getName());
        int counter=1;
        while (!Thread.currentThread().isInterrupted()){
            System.out.println("Loop "+counter++);
        }
        System.out.printf("%s finished...\n",Thread.currentThread().getName());
    }
}
