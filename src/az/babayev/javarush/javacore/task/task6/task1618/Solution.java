package az.babayev.javarush.javacore.task.task6.task1618;

public class Solution {

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    public static class TestThread extends Thread {
        public void run() {

        }
    }
}
