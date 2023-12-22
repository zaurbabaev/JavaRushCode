package az.babayev.javarush.javasyntax_repetition.lection12.models;

public class Wheel {
    public int diametr;
    public String position;

    @Override
    public String toString() {
        return "Wheel{" +
                "diametr=" + diametr +
                ", position='" + position + '\'' +
                '}';
    }
}
