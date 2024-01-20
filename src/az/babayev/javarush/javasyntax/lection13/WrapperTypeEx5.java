package az.babayev.javarush.javasyntax.lection13;

public class WrapperTypeEx5 {
    public static void main(String[] args) {
        Integer i = 432;
        String s = i.toString();

        String s1 = "123245432";
        Integer strToInt = Integer.parseInt(s1);
        System.out.println(strToInt);

        Integer a = 0;
        Integer b = 0;
        b = a;
        a = 12;
        System.out.println(b);



    }
}
