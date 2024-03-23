package az.babayev.javarush.javasyntax.repetition.wraper_type;

public class IntegerExample {
    public static void main(String[] args) {
        Integer age = 18;
        int ageToInt = age;

        Integer a = 1000;

        Integer b = 1000;

        System.out.println(a==b);// false referanslar müqaisə olunur

        System.out.println(a.equals(b)); //true

        String binaryString = Integer.toBinaryString(20);
        System.out.println(binaryString);
        String hexString = Integer.toHexString(20);
        System.out.println(hexString);
        String octalString = Integer.toOctalString(20);
        System.out.println(octalString);

        int parseInt = Integer.parseInt("300");
        System.out.println(parseInt);

    }
}
