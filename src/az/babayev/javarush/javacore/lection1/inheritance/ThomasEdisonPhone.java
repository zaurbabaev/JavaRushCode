package az.babayev.javarush.javacore.lection1.inheritance;

import az.babayev.javarush.javacore.lection1.abstraction.AbstractPhone;
/*
 Одна из первых моделей телефонов:
 */
public class ThomasEdisonPhone extends AbstractPhone {

    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}
