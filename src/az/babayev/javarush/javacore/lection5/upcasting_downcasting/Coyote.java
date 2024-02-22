package az.babayev.javarush.javacore.lection5.upcasting_downcasting;

public class Coyote extends WildAnimal {
    public void methodCoyote() {
        System.out.println("Method Coyote");
    }

    @Override
    public void introduce() {
        System.out.println("I'm Coyote");
    }
}
