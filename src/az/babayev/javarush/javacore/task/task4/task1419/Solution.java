package az.babayev.javarush.javacore.task.task4.task1419;

public class Solution {

    static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }

    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }
}
