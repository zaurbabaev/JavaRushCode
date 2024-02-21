package az.babayev.javarush.javacore.task.task4.task1420;

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println("-".repeat(30));

        System.out.println(getWine().getHolidayName()); // 8ci sətirlə 10-11ci sətirlər eyni qüvvəlidir

        Wine wine = getWine();
        System.out.println(wine.getHolidayName());

        System.out.println("-".repeat(30));

        System.out.println(getSparkingWine().getHolidayName()); // 15ci sətirlə 17-18-ci sətirlər eyni qüvvəlidir

        Wine sparkingWine = getSparkingWine();
        System.out.println(sparkingWine.getHolidayName());

        System.out.println("-".repeat(30));

        System.out.println(getWine().getHolidayName());

    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getSparkingWine() {
        return new SparklingWine();
    }
}
