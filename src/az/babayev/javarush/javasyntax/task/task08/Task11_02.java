package az.babayev.javarush.javasyntax.task.task08;

import java.util.HashSet;
import java.util.Set;

/*
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или
с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть
в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки.
 */
public class Task11_02 {

    public static class Dog {
        public Dog() {
        }
    }

    public static class Cat {
        public Cat() {
        }
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats,dogs);
        printPets(pets);
        System.out.println("-".repeat(65));
        removeCats(pets,cats);
        printPets(pets);
    }
}

