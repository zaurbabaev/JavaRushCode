package az.babayev.javarush.javacore.task.task6.task1620;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);


    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        for (int i = 0; i < threadCount; i++) {
            threads.get(i).interrupt();
        }
    }

    public static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        @Override
        public void run() {
            boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            String threadName = Thread.currentThread().getName();
            try {
                while (!isCurrentThreadInterrupted) {
                    System.out.println("Object " + sharedResource + ", thread " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
