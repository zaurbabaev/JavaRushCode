package az.babayev.javarush.javacore.task.task6.task1605;

import java.util.Date;

public class Solution {

    public static int delay = 1000;

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep((long) n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Violin("Hello"));
        thread.start();

    }
    public static interface MusicInstrument extends Runnable {

        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicInstrument {

        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        @Override
        public Date startPlaying() {
            System.out.println(owner + " is starting to play");
            return new Date();
        }

        @Override
        public Date stopPlaying() {
            System.out.println(owner + " is stopping playing");
            return new Date();
        }

        @Override
        public void run() {
            Date start = startPlaying();
            Solution.sleepNSeconds(3);
            Date stop = stopPlaying();
            System.out.printf("Playing %d ms %n", stop.getTime() - start.getTime());

        }
    }
}
