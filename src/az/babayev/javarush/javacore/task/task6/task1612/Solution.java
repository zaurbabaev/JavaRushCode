package az.babayev.javarush.javacore.task.task6.task1612;


public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner ivanov = new Runner("Ivanov", 4);
        Runner petrov = new Runner("Petrov", 2);

        ivanov.start();
        petrov.start();
        Thread.sleep(2000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class StopWatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public StopWatch(Runner runner) {
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) {
                    doStep();
                }
            } catch (InterruptedException e) {

            }
        }

        private void doStep() throws InterruptedException {
            stepNumber++;
            Thread.sleep(1000 / owner.speed);
            System.out.println(owner.getName() + " delaet shaq №" + stepNumber + "!");
        }

    }

    public static class Runner {
        StopWatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new StopWatch(this);
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }
}
