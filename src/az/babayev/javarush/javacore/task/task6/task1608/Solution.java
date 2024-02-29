package az.babayev.javarush.javacore.task.task6.task1608;

public class Solution {

    public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000_000;

    public static void main(String[] args) throws InterruptedException {

        Politician ivanov = new Politician("Ivanov");
        ivanov.join();
        Politician petrov = new Politician("Petrov");
        Politician sidorov = new Politician("Sidorov");
        while (ivanov.getSpeechCount()+petrov.getSpeechCount()+ sidorov.getSpeechCount()<totalSpeechCount){

        }
        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politician extends Thread {

        private volatile int utteranceCount;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        public String toString() {
            return String.format("%s сказал речь %d раз ", getName(), getSpeechCount());
        }
    }
}
