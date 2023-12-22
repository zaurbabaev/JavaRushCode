package az.babayev.javarush.javasyntax_repetition.lection12.models;


import java.util.Arrays;

public class Car {
    public String color;
    public String model;
    public int doorsCount;
    public int year;
    public Wheel[] wheels;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", doorsCount=" + doorsCount +
                ", year=" + year +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
