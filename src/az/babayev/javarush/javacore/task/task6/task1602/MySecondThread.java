package az.babayev.javarush.javacore.task.task6.task1602;

public class MySecondThread {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        task.start();
    }

    public static class TestThread extends Thread {

        @Override
        public void run() {
            System.out.println("it's a run method");
        }

        static {
            System.out.println("it's a static block inside TestThread");
        }
    }
}
