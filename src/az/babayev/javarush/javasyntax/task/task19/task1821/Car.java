package az.babayev.javarush.javasyntax.task.task19.task1821;

public record Car(String name, Integer price) {

    @Override
    public String toString() {
        return "Automobile " + name + " , price - " + price + " USD";
    }
}
