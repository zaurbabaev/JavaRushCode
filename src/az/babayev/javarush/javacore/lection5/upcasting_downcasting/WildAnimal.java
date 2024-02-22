package az.babayev.javarush.javacore.lection5.upcasting_downcasting;

public class WildAnimal extends Animal {

    public void methodWildAnimal(){
        System.out.println("Method WildAnimal");
    }
    @Override
    public void introduce() {
        System.out.println("I'm WildAnimal");
    }
}
