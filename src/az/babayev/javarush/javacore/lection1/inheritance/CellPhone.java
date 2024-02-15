package az.babayev.javarush.javacore.lection1.inheritance;

import az.babayev.javarush.javacore.lection1.abstraction.WirelessPhone;

public class CellPhone extends WirelessPhone {

    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
    }
}
