package az.babayev.javarush.javacore.lection1.inheritance;

import az.babayev.javarush.javacore.lection1.abstraction.AbstractPhone;

/*
Обычный стационарный телефон
 */
public class Phone extends AbstractPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");

    }
}
