package az.babayev.javarush.javacore.lection1.inheritance;

import az.babayev.javarush.javacore.lection1.abstraction.AbstractPhone;

/*
крутой видеотелефон
 */
public class VideoPhone extends AbstractPhone {

    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Подключаю видеоканал для абонента " + outputNumber);

    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("У вас входящий видеовызов..." + inputNumber);

    }
}
