package az.babayev.javarush.javasyntax.lection19.lambda.stream.animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Müvafiq kriteriyalara uyğun olaraq seçim olunacaq
 */
public class Selector {

    public static List<Owner> owners;

    public static void initData() {

        final Owner owner1 = new Owner("Oleq Malashkov");
        owner1.getPets().addAll(List.of(
                new Cat("Baron", Color.BLACK, 3),
                new Cat("Sultan", Color.DARK_GREY, 4),
                new Dog("Elza", Color.WHITE, 0)
        ));

        final Owner owner2 = new Owner("Dimitry Valiskov");
        owner2.getPets().addAll(List.of(
                new Cat("Rijik", Color.FOXY, 7),
                new Cat("Barsik", Color.FOXY, 5),
                new Parrot("Admiral", Color.BLUE, 3)
        ));

        final Owner owner3 = new Owner("Natalia Krij");
        owner3.getPets().addAll(List.of(
                new Dog("Arnold", Color.FOXY, 3),
                new Pig("Pilesos", Color.LIGHT_GREY, 8)
        ));

        final Owner owner4 = new Owner("Pavel Muraxov");
        owner4.getPets().add(new Snake("Udav", Color.DARK_GREY, 2));

        final Owner owner5 = new Owner("Anton Federonko");
        owner5.getPets().addAll(List.of(
                new Cat("Fisher", Color.BLACK, 16),
                new Cat("Zorro", Color.FOXY, 14),
                new Cat("Margo", Color.WHITE, 3),
                new Cat("Zabiyaka", Color.DARK_GREY, 1)
        ));

        owners = List.of(owner1, owner2, owner3, owner4, owner5);
    }

    public static void main(String[] args) {
        initData();
        List<String> findNames = new ArrayList<>();
        List<Cat> findCats = new ArrayList<>();
        for (Owner owner : owners) {
            for (Animal pet : owner.getPets()) {
                if (Cat.class.equals(pet.getClass()) && Color.FOXY == pet.getColor()) {
                    findCats.add((Cat) pet);
                }
            }
        }
        findCats.sort(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        for (Cat cat : findCats) {
            findNames.add(cat.getName());
        }

        findNames.forEach(System.out::println);
    }

}
