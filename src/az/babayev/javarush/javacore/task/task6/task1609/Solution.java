package az.babayev.javarush.javacore.task.task6.task1609;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("#1");
        Mouse mouse1 = new Mouse("#2");
        Mouse mouse2 = new Mouse("#3");

    }

    public static void eat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " is starting to eat");
            eat();
            System.out.println(getName() + " has finished eating");
        }
    }
}