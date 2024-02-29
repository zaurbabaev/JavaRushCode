package az.babayev.javarush.javacore.task.task6.task1605;

import java.util.Date;

public class TalkAboutMusic {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();

    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep((long) n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicInstrument extends Runnable {

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
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        @Override
        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }

        @Override
        public void run() {
            Date start = startPlaying();
            TalkAboutMusic.sleepNSeconds(1);
            Date stop = stopPlaying();
            System.out.printf("Playing %d ms %n", stop.getTime() - start.getTime());
        }
    }
}
