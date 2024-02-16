package az.babayev.javarush.javacore.task.task2.task1203;

public class Cat extends Pet {
    @Override
    public Pet getChild() {
        return new Cat();
    }
}
