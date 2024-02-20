package az.babayev.javarush.javacore.task.task4.task1403;

import az.babayev.javarush.javacore.task.task2.task1224.Bull;

public class Solution {

    public static void main(String[] args) {
        Building school = getSchool();
        Building building = getBuilding();
        System.out.println(school);
        System.out.println(building);
    }

    public static Building getSchool() {
        return new School();
    }

    public static Building getBuilding() {
        return new Building();
    }


}
