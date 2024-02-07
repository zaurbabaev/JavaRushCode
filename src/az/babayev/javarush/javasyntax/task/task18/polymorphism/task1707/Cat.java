package az.babayev.javarush.javasyntax.task.task18.polymorphism.task1707;

public class Cat extends Pet {

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(CAT);
    }

    public static final String CAT = "Я не люблю людей";

}
