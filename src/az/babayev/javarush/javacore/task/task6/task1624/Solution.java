package az.babayev.javarush.javacore.task.task6.task1624;

public class Solution {

    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main(String[] args) throws InterruptedException {
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }

    static class MyThread extends Thread {

        String message = "inside MyThread ";

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Solution.sleep();
            }
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
