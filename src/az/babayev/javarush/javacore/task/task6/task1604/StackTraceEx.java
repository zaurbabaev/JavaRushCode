package az.babayev.javarush.javacore.task.task6.task1604;

public class StackTraceEx {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();
        thread.join();

        System.out.println("-".repeat(30));

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable {

        @Override
        public void run() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (StackTraceElement element : stackTrace) {
                System.out.println(element);
            }
        }
    }
}
