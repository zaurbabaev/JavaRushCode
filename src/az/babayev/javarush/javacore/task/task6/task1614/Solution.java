package az.babayev.javarush.javacore.task.task6.task1614;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) {
        Countdown countdown = new Countdown(3);
        Thread thread = new Thread(countdown, "CountDown");
        thread.start();
    }

    public static class Countdown implements Runnable {

        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountDown();
                }
            } catch (InterruptedException e) {

            }

        }

        public void printCountDown() throws InterruptedException {
            Thread.sleep(500);
            countFrom--;
            System.out.println(list.get(countFrom));

        }
    }
}
