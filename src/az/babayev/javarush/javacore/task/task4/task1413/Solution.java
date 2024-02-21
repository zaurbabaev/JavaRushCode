package az.babayev.javarush.javacore.task.task4.task1413;

public class Solution {
    public static void main(String[] args) {
        Computer computer = new Computer(new Monitor(), new Keyboard(), new Mouse());

        if (isWork(computer.getKeyboard()) && isWork(computer.getMonitor()) && isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }
}
