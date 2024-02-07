package az.babayev.javarush.javasyntax.task.task18.polymorphism.task1707;

public class Dog extends Pet {
    public static final String DOG = "Я люблю людей";

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(DOG);
    }
}
