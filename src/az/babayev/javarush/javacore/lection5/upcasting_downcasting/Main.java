package az.babayev.javarush.javacore.lection5.upcasting_downcasting;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Pet();
        animal.introduce();

        WildAnimal wildAnimal=new Coyote();
        wildAnimal.methodWildAnimal();

        Coyote coyote = (Coyote) wildAnimal;
        coyote.methodCoyote();

    }
}
