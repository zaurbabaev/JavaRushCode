package az.babayev.javarush.javasyntax_repetition.lection12;

import java.util.Arrays;

public class Car {
    String color;
    String model;
    int year;

    Wheel[] wheels;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", year='").append(year).append('\'');
        sb.append(", wheeles=").append(Arrays.toString(wheels));
        return sb.toString();
    }
}
