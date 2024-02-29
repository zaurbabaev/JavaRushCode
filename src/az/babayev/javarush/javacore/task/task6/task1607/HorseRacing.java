package az.babayev.javarush.javacore.task.task6.task1607;

import java.util.ArrayList;
import java.util.List;

public class HorseRacing {

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorseAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {

        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        for (Horse myHorse : horses) {
            if (myHorse.isFinished()) {
                finishedCount++;
            } else {
                System.out.println("Waiting for " + myHorse.getName());
                myHorse.join();
            }
        }
        return finishedCount;
    }

    public static List<Horse> prepareHorseAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount+1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }
        System.out.println("All horses start the race!");
        for (Horse horse : horses) {
            horse.start();
        }

        return horses;
    }


    public static class Horse extends Thread {
        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {
                s += "" + i;
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}
