package az.babayev.javarush.javasyntax.lection10;

/*
 у нас есть url типа такого: «https://domen.com/about/reviews»,
 и мы хотим заменить имя домена на javarush.com.
 */
public class StringEx5 {
    public static void main(String[] args) {
        String url = "https://domen.com/about/reviews";
        int index = url.indexOf("//");
        int index2 = url.indexOf("/", index + 2);
        String first = url.substring(0, index + 2);
        String second = url.substring(index2);
        String result = first + "javarush.com" + second;
        System.out.println(result);

    }
}
