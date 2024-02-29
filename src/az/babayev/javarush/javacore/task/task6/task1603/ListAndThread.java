package az.babayev.javarush.javacore.task.task6.task1603;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAndThread {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        SpecialThread specialThread1 = new SpecialThread();
        Thread thread1 = new Thread(specialThread1);
        thread1.start();

        SpecialThread specialThread2 = new SpecialThread();
        Thread thread2 = new Thread(specialThread2);
        thread2.start();

        SpecialThread specialThread3 = new SpecialThread();
        Thread thread3 = new Thread(specialThread3);
        thread3.start();

        SpecialThread specialThread4 = new SpecialThread();
        Thread thread4 = new Thread(specialThread4);
        thread4.start();

        SpecialThread specialThread5 = new SpecialThread();
        Thread thread5 = new Thread(specialThread5);
        thread5.start();

        Collections.addAll(list, thread1, thread2, thread3, thread4, thread5);

//        list.forEach(System.out::println);
    }

    public static class SpecialThread implements Runnable {

        @Override
        public void run() {
            System.out.println("it's a run method inside SpecialThread "+Thread.currentThread().getName());
        }
    }
}
