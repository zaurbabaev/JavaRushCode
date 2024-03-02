package az.babayev.javarush.javacore.task.task6.task1611;

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        clock.join();
        System.out.println("The clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException ex) {

            }
        }

        private void printTikTak() throws InterruptedException {
            Thread.sleep(500);
            System.out.println("Tik");
            Thread.sleep(500);
            System.out.println("Tak");
        }

    }
}