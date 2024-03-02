package az.babayev.javarush.javacore.task.task6.task1613;

import java.time.LocalTime;

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {

            }
        }

        private void printTime() throws InterruptedException {
            Thread.sleep(1000);
            LocalTime localTime = LocalTime.of(hours, minutes, seconds).plusSeconds(1);
            hours = localTime.getHour();
            minutes = localTime.getMinute();
            seconds = localTime.getSecond();
//            seconds++;
//            if (seconds == 60) {
//                seconds = 0;
//                minutes++;
//            }
//            if (minutes == 60) {
//                minutes = 0;
//                hours++;
//            }
//            if (hours == 24) {
//                hours = 0;
//            }
            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.printf("В г. %s сейчас полночь!%n", cityName);
            } else {
                System.out.printf("В г. %s сейчас %d:%d:%d%n", cityName, hours, minutes, seconds);
            }
        }

    }
}
