package az.babayev.javarush.javacore.task.task6.task1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        try (InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader reader = new BufferedReader(in)) {
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            reader.readLine();
            stopWatch.interrupt();
        }
    }


    public static class StopWatch extends Thread {
        private int seconds;

        public void run() {
            try {
                Thread currentThread = Thread.currentThread();
                while (!currentThread.isInterrupted()) {
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }

        }
    }
}

