package az.babayev.javarush.javacore.lection1.abstraction;

public abstract class WirelessPhone extends AbstractPhone {

    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }


}
