package az.babayev.javarush.javacore.task.task2.task1203;

public class Dog extends Pet {
    @Override
    public Pet getChild() {
        return new Dog();
    }
}
