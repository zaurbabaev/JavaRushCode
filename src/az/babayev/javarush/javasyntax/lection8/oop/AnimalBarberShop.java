package az.babayev.javarush.javasyntax.lection8.oop;

public class AnimalBarberShop {
    public void shear(Animal animal) {
        System.out.println("Стрижка готова! " + "(" + animal.getClass() + ")");
    }
}
