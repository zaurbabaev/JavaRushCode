package az.babayev.javarush.javasyntax.lection14.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCarEx {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugattiVeyron = new Car("Bugatti Veyron");
        Car diablo = new Car("Lombarghini Diablo");
        Car ford = new Car("Ford Mondeo");
        Car fiat = new Car("Fiat Ducato");
        LinkedList<Car> cars = new LinkedList<>(List.of(ferrari, bugattiVeyron, diablo));
        System.out.println(cars);

        System.out.println("-".repeat(30));

        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println(cars);

        System.out.println("-".repeat(30));

        // ilk elementi qaytarir siyahi bosh olsa null qaytarir
        Car carFist = cars.peekFirst();
        System.out.println(carFist);

        System.out.println("-".repeat(30));
        // sonuncu elementi qaytarir siyahi bosh olsa null qaytarir
        Car carLast = cars.peekLast();
        System.out.println(carLast);
        System.out.println("-".repeat(30));

        // siyahidan ilk elementi qaytarir ve silir, siyahi bosh olsa null qaytarir
        Car pollFirst = cars.pollFirst();
        System.out.println(pollFirst);

        System.out.println("-".repeat(30));

        // siyahidan son elementi qaytarir ve silir, siyahi bosh olsa null qaytarir
        Car pollLast = cars.pollLast();
        System.out.println(pollLast);

        System.out.println("-".repeat(30));

        System.out.println("Что осталось в списке?");

        System.out.println(cars);

        System.out.println("-".repeat(30));

        Car[] array = cars.toArray(new Car[0]);
        Arrays.stream(array).forEach(System.out::println);

    }
}
