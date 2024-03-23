package az.babayev.javarush.javacore.task.task6.task1619;

public class Solution {
    private static boolean isCancel;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod(){
        isCancel=true;

    }
    public static class TestThread implements Runnable{

        @Override
        public void run() {
            while (!isCancel){
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
