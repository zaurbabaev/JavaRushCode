package az.babayev.javarush.javasyntax.lection13;

public class WraperTypeEx {
    public static void main(String[] args) {
        Integer age = 18;
        Integer hundred = 100;
        Integer zero = 0;

        int a = age.intValue();
        int b = hundred;
        int c = zero;

        Integer a1 = Integer.valueOf(12);
        int b1 = a1.intValue();
        Integer a2 = b1+5;

        System.out.println(a2);

        Integer i1=1000;
        Integer i2=1000;

        System.out.println(i1.equals(i2));
    }
}
