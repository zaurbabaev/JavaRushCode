package az.babayev.javarush.javasyntax.lection8.oop;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.voice();
        cat.voice();
        AnimalBarberShop animalBarberShop = new AnimalBarberShop();
        animalBarberShop.shear(dog);
        animalBarberShop.shear(cat);
    }
}
