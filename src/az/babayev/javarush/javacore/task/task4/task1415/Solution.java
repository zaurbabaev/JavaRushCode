package az.babayev.javarush.javacore.task.task4.task1415;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>(List.of(
                new OneRoomApt(),
                new TwoRoomApt(),
                new ThreeRoomApt()
        ));

        cleanAllApartments(apartments);

    }


    public static void cleanAllApartments(List<Apartment> apartments) {
        apartments.forEach(apartment -> {
            if (apartment instanceof OneRoomApt) {
                ((OneRoomApt) apartment).clean1Room();
            } else if (apartment instanceof TwoRoomApt) {
                ((TwoRoomApt) apartment).clean2Rooms();
            } else if (apartment instanceof ThreeRoomApt) {
                ((ThreeRoomApt) apartment).clean3Rooms();
            }
        });
    }

    static interface Apartment {

    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");

        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
