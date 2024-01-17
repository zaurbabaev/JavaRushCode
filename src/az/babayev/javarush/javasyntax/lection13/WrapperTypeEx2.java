package az.babayev.javarush.javasyntax.lection13;

public class WrapperTypeEx2 {
    public static void main(String[] args) {

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue);

        String hexString = Integer.toHexString(12);
        System.out.println(hexString);

        String octalString = Integer.toOctalString(12);
        System.out.println(octalString);


        String binaryString = Integer.toBinaryString(12);
        System.out.println(binaryString);

        Integer valueOf = Integer.valueOf(12);
        System.out.println(valueOf);

        int parseInt = Integer.parseInt("12");
        System.out.println(parseInt);

        Integer i = 12;
        int ii = i.intValue();

        //Сравнение обёртки с примитивом происходит через анбоксинг обёртки
        Integer i1 = 1000;
        int i2 = 1000;
        System.out.println(i1 == i2); //true

        //Сравнение обёртки с обёрткой происходит через сравнение ссылок
        Integer i3 = 500;
        Integer i4 = 500;
        System.out.println(i3 == i4);//false

        //Из-за особенностей реализации автоупаковки в Java для небольших значений
        // (обычно от -128 до 127), если два объекта типа Integer содержат одно
        //   и то же значение в этом диапазоне, они будут указывать на один
        //   и тот же объект в пуле объектов.
        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);//true

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);//false
    }
}
